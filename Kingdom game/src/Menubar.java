import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menubar extends JPanel implements ActionListener{
    private Player player;
    private JButton home;
    
    public Menubar(Player player){
        this.player = player;
        home = new JButton(new ImageIcon("Image/Menubar/home.png"));
        home.setFocusable(false);
        home.setFocusPainted(false);
        home.setContentAreaFilled(false);
        home.setBorder(null);
        home.addActionListener(this);
        this.setLayout(null);
        this.add(home);
        this.setBounds(30, 0, 1215, 80);
        this.setLayout(null);
        home.setBounds(0,10,64,64);
        this.setOpaque(false);
    }
    public void paintComponent(Graphics g){
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+player.getTown().getLevel()+".png").getImage(), 99, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+player.getFarm().getLevel()+".png").getImage(), 273, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+player.getCastle().getLevel()+".png").getImage(), 447, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+player.getMarket().getLevel()+".png").getImage(), 621, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+player.getMilitary().getLevel()+".png").getImage(), 795, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/hCoin.png").getImage(), 953, 10, null);
        g.setFont(new Font("Century", Font.PLAIN, 20)); 
        g.setColor(new Color(0x402a23));
        g.drawString("Town", 109, 20);
        g.drawString("Farm", 283, 20);
        g.drawString("Castle", 457, 20);
        g.drawString("Market", 631, 20);
        g.drawString("Military", 805, 20);
        g.drawString(player.getMoney()+"", 1025, 50);
    }
    public void actionPerformed(ActionEvent ae) {
        Game.change("Menu");
    }
}
