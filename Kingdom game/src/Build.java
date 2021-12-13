import java.awt.*;
import javax.swing.*;
public class Build implements Runnable{
    private boolean state;
    public boolean running;
    public JFrame frame = new JFrame("Teller GUI");
    private JPanel topPanel = new JPanel();
    private JPanel botPanel = new JPanel();

    public Build() {
        frame.setLayout(new GridLayout(2, 1));
        topPanel.setLayout(new GridLayout(2, 2));
        botPanel.setLayout(new FlowLayout());
        addTop();
        addBot();
        frame.add(topPanel);
        frame.add(botPanel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    public synchronized void run() {
        running = true;
        int x = 0;
        try {
            while(running) {
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
    public void addTop() {
        topPanel.add(new JLabel(" Balance"));
        JTextField text = new JTextField("6000");
        text.setEditable(false);
        topPanel.add(text);
        topPanel.add(new JLabel(" Amount"));
        topPanel.add(new JTextField());
    }
    public void addBot() {
        botPanel.add(new JButton("Deposit"));
        botPanel.add(new JButton("Withdraw"));
        botPanel.add(new JButton("Exit"));
    }
}
