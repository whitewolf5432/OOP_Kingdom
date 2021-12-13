import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MarketShop extends JPanel implements ActionListener, Runnable{
    private Market market;
    private JButton bt;
    private Player player;
    private Build build;
    private Font font;
    public MarketShop() {
        this.setBounds(768, 514,256, 198);
    }
    public MarketShop(Market mk, Player player) {
        bt  = new JButton("Upgrade");
        this.setBounds(768, 514,256, 198);
        this.market = mk;
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
        g.drawImage(new ImageIcon("Image/Shop/marketShop_"+market.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public synchronized void run(){
        if(Play.state){
            if(player.payMoney(market.getCost())){
                boolean success = false;
                try {
                    synchronized(this) {
                        build = new Build(market.getWord(), market.getTime());
                        new Thread(build).start();
                        Play.state = false;
                        while(build.frame.isVisible()) {
                            Thread.sleep(300);
                            success = build.getState();
                        }
                        if(success) {
                            market.upLevel();
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
