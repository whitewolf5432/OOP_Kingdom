
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Credit extends javax.swing.JPanel {

    public Credit() {
        initComponents();
    }


    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(153, 42, 24));
        jPanel6.setMaximumSize(new java.awt.Dimension(1280, 800));
        jPanel6.setMinimumSize(new java.awt.Dimension(1280, 800));
        jPanel6.setLayout(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(360, 290, 120, 120);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8);
        jPanel8.setBounds(560, 290, 120, 120);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);
        jPanel9.setBounds(770, 290, 120, 120);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10);
        jPanel10.setBounds(1010, 290, 120, 120);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11);
        jPanel11.setBounds(150, 290, 120, 120);

        jButton2.setLabel("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(520, 680, 240, 70);

        setMaximumSize(new java.awt.Dimension(1280, 800));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setLabel("BACK");
        jButton1.setPreferredSize(new java.awt.Dimension(127, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        ImageIcon im = new ImageIcon(new javax.swing.ImageIcon("Image/Game/images.jpg").getImage());
        ImageIcon bg = new ImageIcon(new javax.swing.ImageIcon("Image/Game/1920x1080_px_A_Bastards_Tale_knight_Pixel_Art_video_games-1325043.jpeg").getImage());
        ImageIcon bt = new ImageIcon(new javax.swing.ImageIcon("Image/Game/butcredit.png").getImage());
        
        add(jButton1);
        jButton1.setBounds(540, 680, 190, 60);

        jLabel1.setIcon((Icon) im);
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel1);
        jLabel1.setBounds(120, 300, 170, 190);

        jLabel2.setIcon((Icon) im);
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel2);
        jLabel2.setBounds(340, 300, 170, 190);

        jLabel3.setIcon((Icon) im);
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        jLabel3.setVerifyInputWhenFocusTarget(false);
        add(jLabel3);
        jLabel3.setBounds(560, 300, 170, 190);

        jLabel4.setIcon((Icon) im);
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel4);
        jLabel4.setBounds(780, 300, 170, 190);

        jLabel5.setIcon((Icon) im);
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel5);
        jLabel5.setBounds(1000, 300, 170, 190);

        jLabel7.setIcon((Icon) bt);
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel7);
        jLabel7.setBounds(540, 680, 190, 60);

        jLabel6.setIcon((Icon) bg);
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1280, 800);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    Game.change("Home");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration                   


}