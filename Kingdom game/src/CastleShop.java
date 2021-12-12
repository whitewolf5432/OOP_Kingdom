import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CastleShop extends JPanel implements ActionListener, Runnable{
    private Castle castle;
    private JButton bt;
    private JLabel lb,lb2;
    private Player player;
    private Build b;
    private Image img = new ImageIcon("Image/Place/castle_0.png").getImage();
    private Image img2 = new ImageIcon("Image/Place/castle_0.png").getImage();
    public CastleShop() {
        this.setBounds(512, 514,256, 198);
    }
    public CastleShop(Castle ct, Player player) {
        bt  = new JButton("Castle");
        lb = new JLabel("0");
        lb2 = new JLabel("5");
        this.setBounds(512, 514,256, 198);
        this.castle = ct;
        this.player = player;
        bt.addActionListener(this);
        this.add(lb2);
        this.add(bt);
        this.add(lb);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("Image/Place/castle_0.png").getImage(), 0, 0, null);
    }
    public void actionPerformed(ActionEvent e){  
        new Thread(this).start();
    }
    public synchronized void run(){
        if(player.payMoney(castle.getCost())){
            boolean success = false;
            try {
                if(castle.getLevel() != 0){
                    synchronized(this) {
                        b = new Build();
                        new Thread(b).start();
                        Play.state = false;
                        while(b.frame.isVisible()) {
                            Thread.sleep(300);
                            success = b.getState();
                        }
                        if(success) {
                            castle.upLevel();
                        }
                        Play.state = true;
                        b.tete = false;
                    }
                } else {
                    castle.upLevel();
                }
                lb.setText(castle.getLevel()+"");
                lb2.setText(castle.getCost()+"");
            } catch(InterruptedException ex) {
                System.out.println(ex);
            }
            this.repaint();
        }
    } 
}
