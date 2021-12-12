import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MilitaryShop extends JPanel implements ActionListener, Runnable{
    private Military military;
    private JButton bt;
    private JLabel lb,lb2;
    private Player py;
    private Image img = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test4.png").getImage();
    private Image img2 = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test3.png").getImage();
    public MilitaryShop() {
        this.setBounds(1024, 514,256, 198);
    }
    public MilitaryShop(Military ml, Player py) {
        bt  = new JButton("Military");
        lb = new JLabel("0");
        lb2 = new JLabel("40");
        this.setBounds(1024, 514,256, 198);
        this.military = ml;
        this.py = py;
        bt.addActionListener(this);
        this.add(lb2);
        this.add(bt);
        this.add(lb);
    }
    public void paintComponent(Graphics g) {
        switch (military.getLevel()) {
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
        new Thread(this).start();
    }  
    public void run(){
        if(py.payMoney(military.getCost())){
            //play
            military.upLevel();
            lb.setText(military.getLevel()+"");
            lb2.setText(military.getCost()+"");
            this.repaint();
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
        
    } 

   
 
    
}
