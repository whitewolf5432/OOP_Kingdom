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
public class FarmButObject extends JPanel{
    private int level;
    private int value;
    private Image img = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\water.png").getImage();
    public FarmButObject() {
        this.setBounds(0, 0, 640, 256);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
}
