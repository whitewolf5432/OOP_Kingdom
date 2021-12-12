import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class Build implements Runnable, KeyListener{
    private boolean state;
    public boolean tete;
    public JFrame frame;
    private JPanel top, bot;
    private JLabel test;
    
    public Build() {
        frame = new JFrame("Build...");
        top = new JPanel();
        bot = new JPanel();
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
    }
    public synchronized void run() {
        tete = true;
        int x = 0;
        try {
            while(tete) {
                Thread.sleep(500);
                System.out.println("x ->> " + x);
                if(x++ == 20) {
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
//        bot.setLayout(new GridLayout(2, 5));
        for(int i=0; i < 30; i++) {
            test = new JLabel("; ");
            test.setFont(new Font("Serif", Font.ITALIC, 45));
            bot.add(test);
        }
        System.out.println(bot.getLayout());
    }
    public static void main(String[] args) {
        new Build();
    }
    public void keyTyped(KeyEvent ke) {}
    public void keyPressed(KeyEvent ke) {
        if(Character.isDefined(ke.getKeyChar()) && ke.getKeyChar() != KeyEvent.VK_ESCAPE && ke.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            System.out.println(ke.getKeyChar());
            test.setText(ke.getKeyChar()+"");
            test.setForeground(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
        }
    }
    public void keyReleased(KeyEvent ke) {}
}
