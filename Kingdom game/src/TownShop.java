import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TownShop extends JPanel implements ActionListener, Runnable{
    private Town town;
    private JButton bt;
    private JLabel lb,lb2;
    private Player py;
    private Image img = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test4.png").getImage();
    private Image img2 = new ImageIcon("D:\\oop\\OOP_Kingdom\\Kingdom game\\src\\test3.png").getImage();
    public TownShop() {
        this.setBounds(0, 514,256, 198);
    }
    public TownShop(Town tn, Player py) {
        bt  = new JButton("Town");
        lb = new JLabel("0");
        lb2 = new JLabel("20");
        this.setBounds(0, 514,256, 198);
        this.town = tn;
        this.py = py;
        bt.addActionListener(this);
        this.add(lb2);
        this.add(bt);
        this.add(lb);

    }
    public void paintComponent(Graphics g) {
        switch (town.getLevel()) {
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
        if(py.payMoney(town.getCost())){
            //play
            town.upLevel();
            lb.setText(town.getLevel()+"");
            lb2.setText(town.getCost()+"");
            this.repaint();
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
        
    } 

   
 
    
}
