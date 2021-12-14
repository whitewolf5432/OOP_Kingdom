
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Ending extends javax.swing.JPanel {


    public Ending() {
        initComponents();
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setBackground(new java.awt.Color(0,0,0,1));
    }


    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        
        ImageIcon bg = new ImageIcon(new javax.swing.ImageIcon("Image/Game/1920x1080_px_A_Bastards_Tale_knight_Pixel_Art_video_games-1325043.jpeg").getImage());
        ImageIcon bt = new ImageIcon(new javax.swing.ImageIcon("Image/Game/butcredit.png").getImage());
        ImageIcon im = new ImageIcon(new javax.swing.ImageIcon("Image/Game/free-paper-texture-10.jpg").getImage());
        
        setPreferredSize(new java.awt.Dimension(1280, 740));
        setLayout(null);

        jButton1.setText("Return To Home");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(550, 610, 190, 60);

        jLabel3.setIcon((Icon) bt);
        add(jLabel3);
        jLabel3.setBounds(550, 610, 190, 60);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Black", 0, 28));
        jTextArea1.setRows(5);
        jTextArea1.setText("               \n                 Congratulations!\n   Your kingdom has evolved. \n   You must be a good king.\n   We hope your people are happy.\n  ");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(350, 390, 570, 290);

        jLabel2.setIcon((Icon) im);
        jLabel2.setOpaque(false);
        add(jLabel2);
        jLabel2.setBounds(350, 390, 570, 290);

        jLabel1.setIcon((Icon) bg);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 740);
    }                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Game.change("Home");
    }                                        


                   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
                
}
