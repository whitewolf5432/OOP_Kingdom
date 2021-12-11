import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FarmShop extends JPanel implements ActionListener{
    private Farm farm;
    private JButton bt;
    private Image img = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test3.png").getImage();
    private Image img2 = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test4.png").getImage();
    public FarmShop() {
        this.setBounds(0, 514,256, 198);
    }
    public FarmShop(Farm fm) {
        bt  = new JButton("Update");
        this.setBounds(0, 514,256, 198);
        this.farm = fm;
        bt.addActionListener(this);
        this.add(bt);
    }
    public void paintComponent(Graphics g) {
        switch (farm.getLevel()) {
            case 1:
                g.drawImage(img, 0, 0, null);
                break;
            case 2:
                g.drawImage(img2, 0, 0, null);
                break;
            case 3:
                g.drawImage(img, 0, 0, null);
                break;
            case 4:
                g.drawImage(img2, 0, 0, null);
                break;
            case 5:
                g.drawImage(img, 0, 0, null);
                break;
            case 6:
                g.drawImage(img2, 0, 0, null);
                break;
            case 7:
                g.drawImage(img, 0, 0, null);
                break;
            case 8:
                g.drawImage(img2, 0, 0, null);
                break;
            case 9:
                g.drawImage(img, 0, 0, null);
                break;
            case 10:
                g.drawImage(img2, 0, 0, null);
                break;
            default:
                g.drawImage(img, 0, 0, null);
                break;
        }
    }
    public void actionPerformed(ActionEvent e){  
         farm.setLevel();
         this.repaint();
    }  

   
 
    
}
