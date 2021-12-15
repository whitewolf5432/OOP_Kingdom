import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CastleShop extends JPanel implements ActionListener, Runnable{
    private Castle castle;
    private JButton upgrade;
    private Player player;
    private Build build;
    private Font font;
    
    public CastleShop() {
        this.setBounds(512, 514,256, 198);
    }
    public CastleShop(Player player) {
        upgrade  = new JButton("Upgrade");
        this.setBounds(512, 514,256, 198);
        this.castle = player.getCastle();
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
        g.drawImage(new ImageIcon("Image/Shop/castleShop_"+castle.getLevel()+".png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public void run(){
        if(Play.state){
            if(player.payMoney(castle.getCost())){
                boolean success = false;
                try {
                    if(castle.getLevel() != 0){
                        build = new Build(castle.getWord(), castle.getTime());
                        new Thread(build).start();
                        Play.state = false;
                        while(build.frame.isVisible()) {
                            Thread.sleep(300);
                            success = build.getState();
                        }
                        if(success) {
                            castle.upLevel();
                        }
                        Play.state = true;
                        build.running = false;
                    } else {
                        castle.upLevel();
                    }
                } catch(InterruptedException ex) {
                    System.out.println(ex);
                }
            }
            if(castle.getLevel() == 10) {
                upgrade.removeActionListener(this);
            }
            this.repaint();
        }
    } 
}
