
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Home extends javax.swing.JPanel {
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")                    
    private void initComponents() {

        Startbut = new javax.swing.JButton();
        Howtoplaybut = new javax.swing.JButton();
        Teambut = new javax.swing.JButton();
        Exitbut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setLayout(null);

        Startbut.setBackground(new java.awt.Color(255, 255, 255));
        Startbut.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Startbut.setForeground(new java.awt.Color(255, 255, 51));
        Startbut.setText("START");
        Startbut.setContentAreaFilled(false);
        Startbut.setFocusPainted(false);
        Startbut.setName(""); // NOI18N
        Startbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbutActionPerformed(evt);
            }
        });
        add(Startbut);
        Startbut.setBounds(500, 140, 310, 90);

        Howtoplaybut.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Howtoplaybut.setForeground(new java.awt.Color(255, 255, 51));
        Howtoplaybut.setText("HOW TO PLAY");
        Howtoplaybut.setContentAreaFilled(false);
        Howtoplaybut.setFocusPainted(false);
        Howtoplaybut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowtoplaybutActionPerformed(evt);
            }
        });
        add(Howtoplaybut);
        Howtoplaybut.setBounds(500, 250, 310, 90);

        Teambut.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Teambut.setForeground(new java.awt.Color(255, 255, 51));
        Teambut.setText("TEAM");
        Teambut.setContentAreaFilled(false);
        Teambut.setFocusPainted(false);
        Teambut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeambutActionPerformed(evt);
            }
        });
        add(Teambut);
        Teambut.setBounds(500, 370, 310, 90);

        Exitbut.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Exitbut.setForeground(new java.awt.Color(255, 102, 102));
        Exitbut.setText("EXIT");
        Exitbut.setContentAreaFilled(false);
        Exitbut.setFocusPainted(false);
        Exitbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbutActionPerformed(evt);
            }
        });
        add(Exitbut);
        Exitbut.setBounds(500, 500, 310, 90);
        ImageIcon im = new ImageIcon(new javax.swing.ImageIcon("Image/Game/unnamed.png").getImage());
        ImageIcon bg = new ImageIcon(new javax.swing.ImageIcon("Image/Game/g2.png").getImage());
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        
        jLabel1.setIcon((Icon) im);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(jLabel1);
        jLabel1.setBounds(500, 370, 310, 90);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon((Icon) im);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(jLabel3);
        jLabel3.setBounds(500, 140, 310, 90);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon((Icon) im);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(jLabel5);
        jLabel5.setBounds(500, 250, 310, 90);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon((Icon) im);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(jLabel6);
        jLabel6.setBounds(500, 500, 310, 90);

        jLabel7.setMaximumSize(new java.awt.Dimension(1280, 800));
        jLabel7.setMinimumSize(new java.awt.Dimension(1280, 800));
        jLabel7.setPreferredSize(new java.awt.Dimension(1280, 800));
        jLabel7.setIcon((Icon) bg);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1280, 800);
    }// </editor-fold>                        

    private void TeambutActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Game.change("Team");
    }                                       

    private void ExitbutActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void StartbutActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Game.change("Play");
    }                                        

    private void HowtoplaybutActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Game.HowToPlay(1);
        Game.change("How To Play");
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JButton Exitbut;
    private javax.swing.JButton Howtoplaybut;
    private javax.swing.JButton Startbut;
    private javax.swing.JButton Teambut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration           
}