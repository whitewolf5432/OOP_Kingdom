import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MilitaryShop extends JPanel implements ActionListener, Runnable{
    private Military military;
    private JButton upgrade;
    private Player player;
    private Build build;
    private Font font;
    
    public MilitaryShop() {
        this.setBounds(1024, 514,256, 198);
    }
    public MilitaryShop(Player player) {
        upgrade  = new JButton("Upgrade");
        this.setBounds(1024, 514,256, 198);
        this.military = player.getMilitary();
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
         g.drawImage(new ImageIcon("Image/Shop/militaryShop_"+military.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public void run(){
        if(Play.state){
            if(player.payMoney(military.getCost())){
                boolean success = false;
                try {
                    build = new Build(military.getWord(), military.getTime());
                    new Thread(build).start();
                    Play.state = false;
                    while(build.frame.isVisible()) {
                        Thread.sleep(300);
                        success = build.getState();
                    }
                    if(success) {
                        military.upLevel();
                    }
                    Play.state = true;
                    build.running = false;
                } catch(InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            if(military.getLevel() == 10) {
                upgrade.removeActionListener(this);
            }
            this.repaint();
        }
    } 
}
