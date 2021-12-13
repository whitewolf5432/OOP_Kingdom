import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Town extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private int time;
    private int[] word;
    
    public Town() {
        this.cost = 20;
        this.time = 10;
        word = new int[] {1, 1, 1, 1};
        this.setBounds(0, 0, 640, 256);
        this.setOpaque(false);
        
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Place/town_"+this.level+".png").getImage(), 0, 0, null);
    }

    public void setLevel() {
        
    }

    public int getLevel() {
        return level;
    }

    public synchronized void upLevel() {
        switch (++this.level) {
            case 1:
                this.value = 2;
                this.cost = 140;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 2:
                this.value = 4;
                this.cost = 400;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 3:
                this.value = 7;
                this.cost = 850;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 4:
                this.value = 11;
                this.cost = 2000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 5:
                this.value = 30;
                this.cost = 7000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 6:
                this.value = 42;
                this.cost = 30000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 7:
                this.value = 125;
                this.cost = 100000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 8:
                this.value = 290;
                this.cost = 207000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 9:
                this.value = 730;
                this.cost = 2000000;
                this.time = 10;
                this.word = new int[] {1,1,1,1};
                break;
            case 10:
                this.value = 17000;
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

    public int[] getWord() {
        return word;
    }

    public int getTime() {
        return time;
    }


 
    
}
