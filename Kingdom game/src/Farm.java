import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Farm extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private int time;
    private int[] word;
    
    public Farm() {
        this.cost = 1;
        this.time = 5;
        word = new int[] {0, 0, 1, 0};
        this.setBounds(0, 256, 640, 256);
        this.setOpaque(false);
        
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Place/farm_"+this.level+".png").getImage(), 0, 0, null);
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
                this.time = 7;
                this.word = new int[] {0,0,2,0};
                break;
            case 2:
                this.value = 3;
                this.cost = 150;
                this.time = 10;
                this.word = new int[] {0,0,4,0};
                break;
            case 3:
                this.value = 5;
                this.cost = 280;
                this.time = 12;
                this.word = new int[] {2,0,0,0};
                break;
            case 4:
                this.value = 9;
                this.cost = 700;
                this.time = 15;
                this.word = new int[] {3,0,0,0};
                break;
            case 5:
                this.value = 13;
                this.cost = 3000;
                this.time = 16;
                this.word = new int[] {3,0,0,0};
                break;
            case 6:
                this.value = 27;
                this.cost = 9500;
                this.time = 10;
                this.word = new int[] {1,0,0,0};
                break;
            case 7:
                this.value = 90;
                this.cost = 30000;
                this.time = 10;
                this.word = new int[] {1,0,0,0};
                break;
            case 8:
                this.value = 200;
                this.cost = 87500;
                this.time = 10;
                this.word = new int[] {1,0,0,0};
                break;
            case 9:
                this.value = 500;
                this.cost = 500000;
                this.time = 10;
                this.word = new int[] {1,0,0,0};
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

    public int getTime() {
        return time;
    }

    public int[] getWord() {
        return word;
    }
    
 
    
}
