import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.*;

public class Game extends JFrame{
    private static JFrame frame;
    private static Play play;
    private static Home home;
    private static Credit credit;
    private static Menu menu;
    private static Tips tip;
    private static Ending end;

    public Game() {
       frame = new JFrame("O(op) Kingdom");
       play = new Play();
       home = new Home();
       credit = new Credit();
       menu = new Menu();
       tip = new Tips();
       end = new Ending();
       frame.setLayout(new BorderLayout());
       frame.add(home);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setSize(1280, 740);
       Thread music = new Thread() {
	public void run() {
		Clip clip;
		try {
			AudioInputStream input = AudioSystem.getAudioInputStream(new File("music/Guitar-Gentle.wav"));
			clip = AudioSystem.getClip();
			clip.open(input);
                        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                        gainControl.setValue(-10.0f);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
};
       music.start();
       frame.setLocationRelativeTo(null);       
       frame.setVisible(true);
       
    }
    public static void HowToPlay(int n){
        tip.setN(n);
    }
    public static void change(String page){
        play.pausePlay();
        switch (page) {
            case "Play":
                play.startPlay();
                frame.setContentPane(play);
                break;
            case "How To Play":
                frame.setContentPane(tip);
                break;
            case "Team":
                frame.setContentPane(credit);
                break;
            case "Exit":
                System.exit(0);
            case "Home":
                frame.setContentPane(home);
                play = new Play();
                break;
            case "Menu":
                frame.setContentPane(menu);
                break;
            case "Ending":
                frame.setContentPane(end);
                break;
            default:
                break;
        }
        frame.revalidate();
        frame.repaint();
    }
    public static void main(String[] args) {
        new Game();
    }
}
