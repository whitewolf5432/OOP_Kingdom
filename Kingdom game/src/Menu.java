
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")                 
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 800));
        setLayout(null);

        jButton1.setText("RESUME");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(490, 180, 250, 100);

        jButton2.setText("HOME");
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(490, 300, 250, 100);

        jButton3.setText("HOW TO PLAY");
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(490, 420, 250, 100);

        jButton4.setText("EXIT");
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        add(jButton4);
        jButton4.setBounds(490, 540, 250, 100);
        
        ImageIcon bt = new ImageIcon(new javax.swing.ImageIcon("Image/Game/Menubut.png").getImage());
        ImageIcon bg = new ImageIcon(new javax.swing.ImageIcon("Image/Game/Overall0.png").getImage());
        
        jLabel5.setIcon((Icon) bt);
        add(jLabel5);
        jLabel5.setBounds(490, 540, 250, 100);

        jLabel4.setIcon((Icon) bt);
        add(jLabel4);
        jLabel4.setBounds(490, 420, 250, 100);

        jLabel3.setIcon((Icon) bt);
        add(jLabel3);
        jLabel3.setBounds(490, 300, 250, 100);

        jLabel2.setIcon((Icon) bt);
        add(jLabel2);
        jLabel2.setBounds(490, 180, 250, 100);

        jLabel1.setIcon((Icon) bg);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 800);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Game.change("Play");
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Game.change("Home");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Game.HowToPlay(0);
        Game.change("How To Play");
    }                                        
                
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    
}
