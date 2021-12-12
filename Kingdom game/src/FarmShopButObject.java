/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class FarmShopButObject extends JPanel{
    private int level;
    private int value;
    private Image img = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test4.png").getImage();
    public FarmShopButObject() {
        this.setBounds(0, 512, 256, 198);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
}
