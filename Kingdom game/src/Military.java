import java.awt.*;
import javax.swing.*;

public class Military extends JPanel implements PlaceInterface{
    private int level;
    private int value;
    private long cost;
    private int time;
    private int[] word;
    
    public Military() {
        this.cost = 40;
        this.time = 5;
        word = new int[] {0, 1, 0, 0};
        this.setBounds(640, 256, 640, 256);
        this.setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Place/military_"+this.level+".png").getImage(), 0, 0, null);
    }
    public int getLevel() {
        return level;
    }
    public synchronized void upLevel() {
        switch (++this.level) {
            case 1:
                this.value = 3;
                this.cost = 200;
                this.time = 8;
                this.word = new int[] {0, 2, 0, 0};
                break;
            case 2:
                this.value = 5;
                this.cost = 500;
                this.time = 10;
                this.word = new int[] {0, 3, 0, 0};
                break;
            case 3:
                this.value = 7;
                this.cost = 1200;
                this.time = 15;
                this.word = new int[] {0, 5, 0, 0};
                break;
            case 4:
                this.value = 10;
                this.cost = 4000;
                this.time = 17;
                this.word = new int[] {0, 7, 0, 0};
                break;
            case 5:
                this.value = 35;
                this.cost = 10000;
                this.time = 20;
                this.word = new int[] {2, 9, 0, 0};
                break;
            case 6:
                this.value = 55;
                this.cost = 45000;
                this.time = 25;
                this.word = new int[] {3, 13, 0, 0};
                break;
            case 7:
                this.value = 250;
                this.cost = 130000;
                this.time = 30;
                this.word = new int[] {5, 15, 0, 0};
                break;
            case 8:
                this.value = 400;
                this.cost = 420000;
                this.time = 35;
                this.word = new int[] {7, 18, 0, 0};
                break;
            case 9:
                this.value = 1200;
                this.cost = 4500000;
                this.time = 36;
                this.word = new int[] {10, 20, 0, 0};
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
    public int getTime() {
        return time;
    }
    public int[] getWord() {
        return word;
    } 
}
