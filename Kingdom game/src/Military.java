import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Military extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private Image military;
    
    public Military() {
        this.cost = 40;
        this.setBounds(640, 256, 640, 256);
        this.setOpaque(false);
        
    }
    public void paintComponent(Graphics g) {
        military = new ImageIcon("Image/Place/military_"+this.level+".png").getImage();
        switch (this.level) {
            case 0:
                g.drawImage(military, 0, 0, null);
                break;
            case 1:
                g.drawImage(military, 0, 0, null);
                break;
            case 2:
                g.drawImage(military, 0, 0, null);
                break;
            case 3:
                g.drawImage(military, 0, 0, null);
                break;
            case 4:
                g.drawImage(military, 0, 0, null);
                break;
            case 5:
                g.drawImage(military, 0, 0, null);
                break;
            case 6:
                g.drawImage(military, 0, 0, null);
                break;
            case 7:
                g.drawImage(military, 0, 0, null);
                break;
            case 8:
                g.drawImage(military, 0, 0, null);
                break;
            case 9:
                g.drawImage(military, 0, 0, null);
                break;
            case 10:
                g.drawImage(military, 0, 0, null);
                break;
            default:
                g.drawImage(military, 0, 0, null);
                break;
        }
    }

    public void setLevel() {
        
    }

    public int getLevel() {
        return level;
    }

    public synchronized void upLevel() {
        switch (++this.level) {
            case 1:
                this.value = 3;
                this.cost = 200;
                break;
            case 2:
                this.value = 5;
                this.cost = 500;
                break;
            case 3:
                this.value = 7;
                this.cost = 1200;
                break;
            case 4:
                this.value = 10;
                this.cost = 4000;
                break;
            case 5:
                this.value = 35;
                this.cost = 10000;
                break;
            case 6:
                this.value = 55;
                this.cost = 45000;
                break;
            case 7:
                this.value = 250;
                this.cost = 130000;
                break;
            case 8:
                this.value = 400;
                this.cost = 420000;
                break;
            case 9:
                this.value = 1200;
                this.cost = 4500000;
                break;
            case 10:
                this.value = 30000;
                this.cost = 0;
                break;
            default:
                break;
        }
        this.repaint();
    }

    public int getValue() {
        return value;
    }

    public long getCost() {
        return cost;
    }

 
    
}
