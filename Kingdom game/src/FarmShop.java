import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FarmShop extends JPanel implements ActionListener, Runnable{
    private Farm farm;
    private JButton bt;
    private Player player;
    private Build build;
    private Font font;
    public FarmShop() {
        this.setBounds(256, 514,256, 198);
    }
    public FarmShop(Farm fm, Player player) {
        bt  = new JButton("Upgrade");
        this.setBounds(256, 514,256, 198);
        this.farm = fm;
        this.player = player;
        this.setLayout(null);
        bt.setBounds(3,152,250,44);
        font = new Font("Century", Font.BOLD,20);
        bt.setBackground(new Color(0x795548));
        bt.setForeground(new Color(0xead2ac));
        bt.setFont(font);
        bt.setFocusPainted(false);
        bt.setFocusable(false);
        bt.addActionListener(this);
        this.add(bt);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Shop/farmShop_"+farm.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public synchronized void run(){
        if(Play.state){
            if(player.payMoney(farm.getCost())){
                boolean success = false;
                try {
                    synchronized(this) {
                        build = new Build(farm.getWord(), farm.getTime());
                        new Thread(build).start();
                        Play.state = false;
                        while(build.frame.isVisible()) {
                            Thread.sleep(300);
                            success = build.getState();
                        }
                        if(success) {
                            farm.upLevel();
                        }
                        Play.state = true;
                        build.running = false;
                    }
                } catch(InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            this.repaint();
        }
    } 
}
