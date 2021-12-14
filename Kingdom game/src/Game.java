
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class Game {
    private static JFrame fr;
    private static Home hp;
    private static Credit cd;
    private static Menu mn;
    private static Tips ht;

    public Game() {
       fr = new JFrame();
       hp = new Home();
       cd = new Credit();
       mn = new Menu();
       ht = new Tips();
       fr.setLayout(new BorderLayout());
       fr.add(hp);

       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setResizable(false);
       fr.setSize(1280, 800);
       fr.setLocationRelativeTo(null);       
       fr.setVisible(true);
       
    }
    public static void HowToPlay(int n){
        ht.setN(n);
    }
    public static void change(String n){
        if(n.equals("Play")){
            fr.setContentPane(hp);
            fr.revalidate();
            fr.repaint();
        } 
        else if(n.equals("How To Play")){
            fr.setContentPane(ht);
            fr.revalidate();
            fr.repaint();
        }
        else if(n.equals("Team")){
            fr.setContentPane(cd);
            fr.revalidate();
            fr.repaint();
        }
        else if(n.equals("Exit") || n.equals("Home")){
            fr.setContentPane(hp);
            fr.revalidate();
            fr.repaint();
        }
        else if(n.equals("Menu")){
            fr.setContentPane(mn);
            fr.revalidate();
            fr.repaint();
        }
    }
    
    public static void main(String[] args) {
        new Game();
    }
}
