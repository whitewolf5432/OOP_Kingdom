
import javax.swing.Icon;
import javax.swing.ImageIcon;




public class Tips extends javax.swing.JPanel {
    int n = 0;
    
    public Tips() {
        initComponents();
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setOpaque(false);
        howtoplay.setOpaque(false);
        howtoplay.setBackground(new java.awt.Color(0,0,0,1));
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

   
    @SuppressWarnings("unchecked")
                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        howtoplay = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        
        ImageIcon pa = new ImageIcon(new javax.swing.ImageIcon("Image/Game/free-paper-texture-10.jpg").getImage());
        ImageIcon bg = new ImageIcon(new javax.swing.ImageIcon("Image/Game/maxresdefault.jpg").getImage());
        ImageIcon bt = new ImageIcon(new javax.swing.ImageIcon("Image/Game/51e237725379e52.png").getImage());
        
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setLayout(null);

        jButton1.setFont(new java.awt.Font("Century", 0, 18));
        jButton1.setText("BACK");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(50, 50, 160, 60);

        jLabel3.setIcon((Icon) bt);
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));
        add(jLabel3);
        jLabel3.setBounds(50, 50, 160, 60);

        howtoplay.setEditable(false);
        howtoplay.setColumns(20);
        howtoplay.setFont(new java.awt.Font("Angsana New", 0, 30));
        howtoplay.setRows(5);
        howtoplay.setText("\n\t\t\tวิธีเล่น\n  1.การที่เราจะสร้างหรืออัพเกรดสิ่งก่อสร้างนั้นจะขึ้นอยู่กับ\n     จำนวนเงินเงินของผู้เล่นว่ามีเพียงพอหรือไม่ และเมื่อเริ่ม\n     เกมผู้เล่นจะมีเงินอยู่จำนวนนึง\n  2.เมื่อเราได้ทำการกดอัพเกรดหรือสร้างสิ่งก่อสร้างจะมีการ\n     เด้งหน้าต่างมินิเกมขึ้นมาให้ผู้เล่นทำการ พิมพ์ตัวอักษร\n     ให้ถูกตามที่กำหนด ในกรณีที่ผู้เล่นกดพลาดหรือ หมดเวลา\n     การอัพเกรดนั้นจะถือเป็นโมฆะ และเงินที่ผู้เล่นเสียไปนั้น\n     จะไม่ได้กลับคืน\n  3.การอัพเกรดสิ่งก่อสร้างแต่ละขั้นนั้นจะทำการเพิ่มจำนวน\n     เงินต่อวินาทีของผู้เล่นขึ้น ขึ้นอยู่กับสิ่งก่อสร้างนั้นๆ\n  4.เกมจะจบลงเมื่อผู้เล่นทำการอัพเกรดสิ่งก่อสร้างทั้ง 5 ส่วน\n     จนถึงเลเวล 10 ทั้งหมด\n     ");
        howtoplay.setBorder(null);
        jScrollPane1.setViewportView(howtoplay);

        add(jScrollPane1);
        jScrollPane1.setBounds(410, 110, 500, 580);

        jLabel2.setIcon((Icon) pa);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        add(jLabel2);
        jLabel2.setBounds(410, 110, 500, 580);

        jLabel1.setIcon((Icon) bg);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 800);
    }                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (n == 1){
            Game.change("Home");
        }
        else{
            Game.change("Menu");
        }
    }                                        


                 
    private javax.swing.JTextArea howtoplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
                
}
