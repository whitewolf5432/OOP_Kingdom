import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FarmShop extends JPanel implements ActionListener, Runnable{
    private Farm farm;
    private JButton upgrade;
    private Player player;
    private Build build;
    private Font font;
    
    public FarmShop(Player player) {
        upgrade  = new JButton("Upgrade");
        this.setBounds(256, 514,256, 198);
        this.farm = player.getFarm();
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
        g.drawImage(new ImageIcon("Image/Shop/farmShop_"+farm.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public void run(){
        if(Play.state){
            if(player.payMoney(farm.getCost())){
                boolean success = false;
                try {
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
                } catch(InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            if(farm.getLevel() == 10) {
                upgrade.removeActionListener(this);
            }
            this.repaint();
        }
    } 
}
