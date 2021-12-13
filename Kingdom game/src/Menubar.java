import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Menubar extends JPanel implements ActionListener{
    private Player player;
    private Farm farm;
    private Town town;
    private Castle castle;
    private Market market;
    private Military military;
    private JButton home;
    public Menubar(Player player, Town town, Farm farm, Castle castle, Market market, Military military){
        this.player = player;
        this.farm = farm;
        this.town = town;
        this.castle = castle;
        this.market=  market;
        this.military = military;
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
        //g.drawImage(new ImageIcon("Image/Menubar/home.png").getImage(), 0, 10, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+town.getLevel()+".png").getImage(), 99, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+farm.getLevel()+".png").getImage(), 273, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+castle.getLevel()+".png").getImage(), 447, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+market.getLevel()+".png").getImage(), 621, 25, null);
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_"+military.getLevel()+".png").getImage(), 795, 25, null);
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
        
    }
    
}
