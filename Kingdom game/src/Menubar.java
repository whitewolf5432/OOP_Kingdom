import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Menubar extends JPanel{
    private Player player;
    public Menubar(Player player){
        this.player = player;
        this.setBounds(0, 0, 1200, 80);
        this.setLayout(null);
        this.setOpaque(false);
    }
    public void paintComponent(Graphics g){
        g.drawImage(new ImageIcon("Image/Menubar/progressBar_10.png").getImage(), 0, 0, null);
    }
}
