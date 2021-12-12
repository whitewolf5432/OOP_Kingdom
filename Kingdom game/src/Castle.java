import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Castle extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private Image castle;
    
    public Castle() {
        this.cost = 5;
        this.setBounds(480, 160, 640, 256);
        this.setOpaque(false);
        
    }
    public void paintComponent(Graphics g) {
        castle = new ImageIcon("Image/Place/castle_"+this.level+".png").getImage();
        switch (this.level) {
            case 0:
                g.drawImage(castle, 0, 0, null);
                break;
            case 1:
                g.drawImage(castle, 0, 0, null);
                break;
            case 2:
                g.drawImage(castle, 0, 0, null);
                break;
            case 3:
                g.drawImage(castle, 0, 0, null);
                break;
            case 4:
                g.drawImage(castle, 0, 0, null);
                break;
            case 5:
                g.drawImage(castle, 0, 0, null);
                break;
            case 6:
                g.drawImage(castle, 0, 0, null);
                break;
            case 7:
                g.drawImage(castle, 0, 0, null);
                break;
            case 8:
                g.drawImage(castle, 0, 0, null);
                break;
            case 9:
                g.drawImage(castle, 0, 0, null);
                break;
            case 10:
                g.drawImage(castle, 0, 0, null);
                break;
            default:
                g.drawImage(castle, 0, 0, null);
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
                this.cost = 100;
                break;
            case 2:
                this.value = 4;
                this.cost = 350;
                break;
            case 3:
                this.value = 10;
                this.cost = 700;
                break;
            case 4:
                this.value = 17;
                this.cost = 1800;
                break;
            case 5:
                this.value = 25;
                this.cost = 5000;
                break;
            case 6:
                this.value = 50;
                this.cost = 28000;
                break;
            case 7:
                this.value = 190;
                this.cost = 70000;
                break;
            case 8:
                this.value = 350;
                this.cost = 150000;
                break;
            case 9:
                this.value = 700;
                this.cost = 50000000;
                break;
            case 10:
                this.value = -98765;
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
