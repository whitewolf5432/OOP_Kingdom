import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Farm extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private Image farm;
    
    public Farm() {
        this.cost = 10;
        this.setBounds(0, 256, 640, 256);
        this.setOpaque(false);
        
    }
    public void paintComponent(Graphics g) {
        farm = new ImageIcon("Image/Place/farm_"+this.level+".png").getImage();
        switch (this.level) {
            case 0:
                g.drawImage(farm, 0, 0, null);
                break;
            case 1:
                g.drawImage(farm, 0, 0, null);
                break;
            case 2:
                g.drawImage(farm, 0, 0, null);
                break;
            case 3:
                g.drawImage(farm, 0, 0, null);
                break;
            case 4:
                g.drawImage(farm, 0, 0, null);
                break;
            case 5:
                g.drawImage(farm, 0, 0, null);
                break;
            case 6:
                g.drawImage(farm, 0, 0, null);
                break;
            case 7:
                g.drawImage(farm, 0, 0, null);
                break;
            case 8:
                g.drawImage(farm, 0, 0, null);
                break;
            case 9:
                g.drawImage(farm, 0, 0, null);
                break;
            case 10:
                g.drawImage(farm, 0, 0, null);
                break;
            default:
                g.drawImage(farm, 0, 0, null);
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
                this.value = 1;
                this.cost = 70;
                break;
            case 2:
                this.value = 3;
                this.cost = 150;
                break;
            case 3:
                this.value = 5;
                this.cost = 280;
                break;
            case 4:
                this.value = 9;
                this.cost = 700;
                break;
            case 5:
                this.value = 13;
                this.cost = 3000;
                break;
            case 6:
                this.value = 27;
                this.cost = 9500;
                break;
            case 7:
                this.value = 90;
                this.cost = 30000;
                break;
            case 8:
                this.value = 200;
                this.cost = 87500;
                break;
            case 9:
                this.value = 500;
                this.cost = 500000;
                break;
            case 10:
                this.value = 5000;
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
