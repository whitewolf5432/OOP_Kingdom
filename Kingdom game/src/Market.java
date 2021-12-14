import java.awt.*;
import javax.swing.*;

public class Market extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private int time;
    private int[] word;
    
    public Market() {
        this.cost = 150;
        this.time = 5;
        word = new int[] {0, 0, 0, 1};
        this.setBounds(640, 0, 640, 256);
        this.setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Place/market_"+this.level+".png").getImage(), 0, 0, null);
    }
    public int getLevel() {
        return level;
    }
    public synchronized void upLevel() {
        switch (++this.level) {
            case 1:
                this.value = 5;
                this.cost = 500;
                this.time = 8;
                this.word = new int[] {0, 0, 0, 2};
                break;
            case 2:
                this.value = 12;
                this.cost = 1500;
                this.time = 15;
                this.word = new int[] {0, 0, 0, 4};
                break;
            case 3:
                this.value = 27;
                this.cost = 4800;
                this.time = 17;
                this.word = new int[] {0, 0, 0, 6};
                break;
            case 4:
                this.value = 55;
                this.cost = 15000;
                this.time = 20;
                this.word = new int[] {0, 0, 0, 8};
                break;
            case 5:
                this.value = 120;
                this.cost = 50000;
                this.time = 25;
                this.word = new int[] {0, 0, 0, 10};
                break;
            case 6:
                this.value = 400;
                this.cost = 200000;
                this.time = 30;
                this.word = new int[] {0, 0, 0, 13};
                break;
            case 7:
                this.value = 1500;
                this.cost = 500000;
                this.time = 35;
                this.word = new int[] {0, 0, 0, 15};
                break;
            case 8:
                this.value = 3500;
                this.cost = 1500000;
                this.time = 40;
                this.word = new int[] {0, 0, 0, 18};
                break;
            case 9:
                this.value = 15000;
                this.cost = 10000000;
                this.time = 45;
                this.word = new int[] {0, 0, 0, 30};
                break;
            case 10:
                this.value = 200000;
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
