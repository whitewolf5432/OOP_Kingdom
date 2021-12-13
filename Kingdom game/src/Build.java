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
    private JLabel labelChar;
    private String lowerCase, upperCase, number, symbol, storeWord;
    private int xxx;
    private char rChar;
    private Font font;
    private ArrayList<JLabel> strMiniGame;
    
    public Build() {
        frame = new JFrame("Build...");
        top = new JPanel();
        bot = new JPanel();
        font = new Font("Serif", Font.ITALIC, 45);
        lowerCase = "abcdefghijklmnopqrstuvwxyz";
        upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        number = "0123456789";
        symbol = "!@#$%^&*()-_=+{[}]\\|;:'\"`~,<.>/?";
        storeWord = "";
        strMiniGame = new ArrayList();
        frame.setLayout(null);
        top.setBounds(0, 0, 410, 50);
        top.setBackground(Color.BLUE);
        bot.setBounds(0, 50, 410, 300);
        bot.setBackground(Color.orange);
        topPanel();
        botPanel();
        frame.addKeyListener(this);
        frame.add(top, BorderLayout.NORTH);
        frame.add(bot, BorderLayout.SOUTH);
        frame.setSize(410, 50+(75 * 3));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public synchronized void run() {
        running = true;
        int x = 0;
        try {
            while(running) {
                Thread.sleep(500);
                System.out.println("x ->> " + x);
                if(x++ == 1) {
                    state = true;
                }
            }
            System.out.println(x);
        } catch(InterruptedException tttt) {
            System.out.println("x");
        }
    }
    public boolean getState() {
        return state;
    }
    public void topPanel() {
    }
    public void botPanel() {
        for(int i=0; i < 10; i++) {
            storeWord += lowerCase.charAt((int)(Math.random() * (lowerCase.length()-1)));
        }
        for(int i=0; i < 10; i++) {
            storeWord += upperCase.charAt((int)(Math.random() * (upperCase.length()-1)));
        }
        for(int i=0; i < 10; i++) {
            storeWord += number.charAt((int)(Math.random() * (number.length()-1)));
        }
        for(int i=0; i < 10; i++) {
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
        strMiniGame.get(xxx).setForeground(Color.GRAY);
    }
    public void fail() {
        
    }
    public void done() {
        state = true;
    }
    public static void main(String[] args) {
        new Build();
    }
    public void keyTyped(KeyEvent ke) {}
    public void keyPressed(KeyEvent ke) {
        if(Character.isDefined(ke.getKeyChar()) && ke.getKeyChar() != KeyEvent.VK_ESCAPE && ke.getKeyChar() != KeyEvent.VK_BACK_SPACE && ke.getKeyChar() != KeyEvent.VK_SPACE) {
            System.out.println(ke.getKeyChar());
            if(strMiniGame.get(xxx).getText().charAt(0) == ke.getKeyChar()) {
                strMiniGame.get(xxx).setForeground(Color.GREEN);
            } else {
                strMiniGame.get(xxx).setForeground(Color.RED);
                fail();
            }
            strMiniGame.get(++xxx).setForeground(Color.GRAY);
        }
    }
    public void keyReleased(KeyEvent ke) {}
}
