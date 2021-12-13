import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Build implements Runnable, KeyListener{
    private boolean state;
    public boolean running;
    public JFrame frame;
    private JPanel top, bot;
    private JLabel labelChar, topLabel, timeText;
    private String lowerCase, upperCase, number, symbol, storeWord;
    private int index, word[], time, len;
    private Font font;
    private ArrayList<JLabel> strMiniGame;
    
    public Build(int[] word, int time) {
        this.word = word;
        this.time = time;
        len = word[0] + word[1] + word[2] + word[3];
        frame = new JFrame("Build...");
        top = new JPanel();
        bot = new JPanel();
        font = new Font("Monospaced", Font.PLAIN, 34);
        lowerCase = "abcdefghijklmnopqrstuvwxyz";
        upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        number = "0123456789";
        symbol = "!@#$%^&*()-_=+{[}]\\|;:'\"`~,<.>/?";
        storeWord = "";
        strMiniGame = new ArrayList();
        frame.setLayout(null);
        top.setBounds(0, 0, 410, 75);
        top.setLayout(null);
        topLabel = new JLabel(new ImageIcon("Image/Build/readme.png"));
        topLabel.setSize(410, 75);
        timeText = new JLabel("Time: "+time);
        timeText.setFont(new Font("Helvetica", Font.LAYOUT_RIGHT_TO_LEFT, 15));
        timeText.setBounds(333, -3, 150, 35);
        top.add(timeText);
        top.add(topLabel);
        bot.setBounds(0, 75, 410, 1000);
        bot.setBackground(Color.orange);
        topPanel();
        botPanel();
        frame.add(top, BorderLayout.NORTH);
        frame.add(bot, BorderLayout.SOUTH);
        frame.setSize(415, 90+(80 * (len / 10 + 1) - (len / 10 * 15)));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(this);
    }
    public void run() {
        running = true;
        try {
            while(time-- != 0) {
                Thread.sleep(1000);
                timeText.setText("Time: "+time);
            }
            frame.dispose();
        } catch(InterruptedException error) {
            System.out.println(error);
        }
    }
    public boolean getState() {
        return state;
    }
    public static void main(String[] args) {
        new Build(new int[] {0, 0, 0, 8}, 5);
    }
    public void topPanel() {
    }
    public void botPanel() {
        for(int i=0; i < word[0]; i++) {
            storeWord += lowerCase.charAt((int)(Math.random() * (lowerCase.length()-1)));
        }
        for(int i=0; i < word[1]; i++) {
            storeWord += upperCase.charAt((int)(Math.random() * (upperCase.length()-1)));
        }
        for(int i=0; i < word[2]; i++) {
            storeWord += number.charAt((int)(Math.random() * (number.length()-1)));
        }
        for(int i=0; i < word[3]; i++) {
            storeWord += symbol.charAt((int)(Math.random() * (symbol.length()-1)));
        }
        List<String> letters = Arrays.asList(storeWord.split(""));
        Collections.shuffle(letters);
        for(String letter: letters) {
            labelChar = new JLabel(letter + " ");
            labelChar.setFont(font);
            bot.add(labelChar);
            strMiniGame.add(labelChar);
        }
        strMiniGame.get(index).setForeground(new Color(0xadad85));
    }
    public void fail() {
        frame.removeKeyListener(this);
        close();
    }
    public synchronized void done() {
        state = true;
        frame.removeKeyListener(this);
        close();
    }
    public void close() {
        try {
            Thread.sleep(750);
        } catch(InterruptedException error) {
            System.out.println(error);
        }
        frame.dispose();
    }
    public void keyTyped(KeyEvent ke) {}
    public synchronized void keyPressed(KeyEvent ke) {
        if(Character.isDefined(ke.getKeyChar()) && ke.getKeyChar() != KeyEvent.VK_ESCAPE && ke.getKeyChar() != KeyEvent.VK_BACK_SPACE && ke.getKeyChar() != KeyEvent.VK_SPACE) {
            if(strMiniGame.get(index).getText().charAt(0) == ke.getKeyChar()) {
                strMiniGame.get(index).setForeground(Color.GREEN);
                if(++index == strMiniGame.size()) {
                    done();
                } else {
                    strMiniGame.get(index).setForeground(new Color(0xadad85));
                }
            } else {
                strMiniGame.get(index).setForeground(Color.RED);
                fail();
            }
        }
    }
    public void keyReleased(KeyEvent ke) {}
}
