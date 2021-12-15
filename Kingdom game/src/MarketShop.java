import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MarketShop extends JPanel implements ActionListener, Runnable{
    private Market market;
    private JButton upgrade;
    private Player player;
    private Build build;
    private Font font;
    
    public MarketShop() {
        this.setBounds(768, 514,256, 198);
    }
    public MarketShop(Player player) {
        upgrade  = new JButton("Upgrade");
        this.setBounds(768, 514,256, 198);
        this.market = player.getMarket();
        this.player = player;
        this.setLayout(null);
        upgrade.setBounds(3,152,250,44);
        font = new Font("Century", Font.BOLD,20);
        upgrade.setBackground(new Color(0x795548));
        upgrade.setForeground(new Color(0xead2ac));
        upgrade.setFont(font);
        upgrade.setFocusPainted(false);
        upgrade.setFocusable(false);
        upgrade.addActionListener(this);
        this.add(upgrade);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Shop/marketShop_"+market.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public void run(){
        if(Play.state){
            if(player.payMoney(market.getCost())){
                boolean success = false;
                try {
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
                } catch(InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            if(market.getLevel() == 10) {
                upgrade.removeActionListener(this);
            }
            this.repaint();
        }
    } 
}
