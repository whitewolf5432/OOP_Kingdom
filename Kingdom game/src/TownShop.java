import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TownShop extends JPanel implements ActionListener, Runnable{
    private Town town;
    private JButton bt;
    private Player player;
    private Build build;
    private Font font;
    public TownShop() {
        this.setBounds(0, 514,256, 198);
    }
    public TownShop(Town tn, Player player) {
        bt  = new JButton("Upgrade");
        this.setBounds(0, 514,256, 198);
        this.town = tn;
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
        g.drawImage(new ImageIcon("Image/Shop/townShop_"+town.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public synchronized void run(){
        if(Play.state){
            if(player.payMoney(town.getCost())){
                boolean success = false;
                try {
                    synchronized(this) {
                        build = new Build(town.getWord(), town.getTime());
                        new Thread(build).start();
                        Play.state = false;
                        while(build.frame.isVisible()) {
                            Thread.sleep(300);
                            success = build.getState();
                        }
                        if(success) {
                            town.upLevel();
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
