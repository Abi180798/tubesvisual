/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buspariwisata;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xatalie
 */
public class TambahBus extends javax.swing.JFrame {
    public Database database;
    /**
     * Creates new form Utama
     */
    public TambahBus() {
        initComponents();
        database=new Database();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        btnjadwal = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        btnout = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        labDaf = new javax.swing.JLabel();
        labplat = new javax.swing.JLabel();
        tfplat = new javax.swing.JTextField();
        labjmlkursi = new javax.swing.JLabel();
        tfjmlkursi = new javax.swing.JTextField();
        labharga = new javax.swing.JLabel();
        tfharga = new javax.swing.JTextField();
        tfTipe = new javax.swing.JTextField();
        labTipe = new javax.swing.JLabel();
        btntambah = new javax.swing.JLabel();
        nav = new javax.swing.JLabel();
        backnav = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel1.setLayout(null);

        judul.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        judul.setText("Pemesanan Bus Pariwisata");
        jPanel1.add(judul);
        judul.setBounds(90, 10, 330, 30);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buspariwisata/buslogo.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(20, 0, 66, 70);

        pt.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pt.setText("PT. Lancar Jaya");
        jPanel1.add(pt);
        pt.setBounds(90, 40, 160, 20);

        btnjadwal.setBackground(new java.awt.Color(255, 255, 255));
        btnjadwal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnjadwal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnjadwal.setText("Jadwal Bus");
        btnjadwal.setAlignmentX(2.0F);
        btnjadwal.setAlignmentY(2.0F);
        btnjadwal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnjadwal.setOpaque(true);
        btnjadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnjadwalMouseClicked(evt);
            }
        });
        jPanel1.add(btnjadwal);
        btnjadwal.setBounds(90, 90, 90, 20);

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setText("Kembali");
        btnback.setAlignmentX(2.0F);
        btnback.setAlignmentY(2.0F);
        btnback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnback.setOpaque(true);
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(570, 90, 70, 20);

        btnout.setBackground(new java.awt.Color(255, 255, 255));
        btnout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnout.setText("Logout");
        btnout.setAlignmentX(2.0F);
        btnout.setAlignmentY(2.0F);
        btnout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnout.setOpaque(true);
        btnout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnout);
        btnout.setBounds(650, 90, 60, 20);

        btnhome.setBackground(new java.awt.Color(255, 255, 255));
        btnhome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnhome.setText("Home");
        btnhome.setAlignmentX(2.0F);
        btnhome.setAlignmentY(2.0F);
        btnhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnhome.setOpaque(true);
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        jPanel1.add(btnhome);
        btnhome.setBounds(20, 90, 60, 20);

        labDaf.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labDaf.setForeground(new java.awt.Color(255, 255, 255));
        labDaf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDaf.setText("Tambah Bus");
        labDaf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(labDaf);
        labDaf.setBounds(20, 130, 680, 30);

        labplat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labplat.setForeground(new java.awt.Color(255, 255, 255));
        labplat.setText("Plat");
        jPanel1.add(labplat);
        labplat.setBounds(30, 220, 100, 22);

        tfplat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfplat);
        tfplat.setBounds(300, 220, 230, 30);

        labjmlkursi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labjmlkursi.setForeground(new java.awt.Color(255, 255, 255));
        labjmlkursi.setText("Jumlah Kursi");
        jPanel1.add(labjmlkursi);
        labjmlkursi.setBounds(30, 260, 130, 22);

        tfjmlkursi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfjmlkursi);
        tfjmlkursi.setBounds(300, 260, 230, 30);

        labharga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labharga.setForeground(new java.awt.Color(255, 255, 255));
        labharga.setText("Harga");
        jPanel1.add(labharga);
        labharga.setBounds(30, 300, 100, 22);

        tfharga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfharga);
        tfharga.setBounds(300, 300, 230, 30);

        tfTipe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(tfTipe);
        tfTipe.setBounds(300, 180, 230, 30);

        labTipe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labTipe.setForeground(new java.awt.Color(255, 255, 255));
        labTipe.setText("Tipe Bus");
        jPanel1.add(labTipe);
        labTipe.setBounds(30, 180, 100, 22);

        btntambah.setBackground(new java.awt.Color(255, 255, 255));
        btntambah.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btntambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btntambah.setText("Tambah Bus");
        btntambah.setAlignmentX(2.0F);
        btntambah.setAlignmentY(2.0F);
        btntambah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btntambah.setOpaque(true);
        btntambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntambahMouseClicked(evt);
            }
        });
        jPanel1.add(btntambah);
        btntambah.setBounds(560, 180, 140, 20);

        nav.setBackground(new java.awt.Color(51, 51, 51));
        nav.setOpaque(true);
        jPanel1.add(nav);
        nav.setBounds(0, 80, 720, 40);

        backnav.setOpaque(true);
        jPanel1.add(backnav);
        backnav.setBounds(0, 0, 720, 80);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buspariwisata/ground.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 720, 540);

        jMenu1.setText("File");

        jMenuItem2.setText("Pesan Bus");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Tambah Bus");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Jadwal Bus");
        jMenu1.add(jMenuItem4);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        int pil=JOptionPane.showConfirmDialog(null, "Apakah Yakin?","",JOptionPane.YES_NO_OPTION);
        if (pil==JOptionPane.YES_OPTION){
            this.dispose();
        }else{
            
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void btntambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseClicked
        // TODO add your handling code here:
        try {
            
            String sql = "INSERT INTO bus VALUES (?,?,?,?,?)";
            PreparedStatement pst;
            pst = database.conn.prepareStatement(sql);
            
            pst.setNull(1, java.sql.Types.INTEGER);
            pst.setString(2, tfTipe.getText());
            pst.setString(3, tfplat.getText());
            pst.setString(4, tfjmlkursi.getText());
            pst.setInt(5, Integer.parseInt(tfharga.getText()));
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Input Berhasil");
            
            Utama utama = new Utama();
            utama.setVisible(true);
            utama.setLocationRelativeTo(null);
            
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        }
    }//GEN-LAST:event_btntambahMouseClicked

    private void btnoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnoutMouseClicked
        // TODO add your handling code here:
        int pil=JOptionPane.showConfirmDialog(null, "Apakah Yakin?","",JOptionPane.YES_NO_OPTION);
        if (pil==JOptionPane.YES_OPTION){
            this.dispose();
            new BusPariwisata().setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_btnoutMouseClicked

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Utama().setVisible(true);
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Utama().setVisible(true);
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnjadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjadwalMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new JadwalBus().setVisible(true);
    }//GEN-LAST:event_btnjadwalMouseClicked
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JLabel background;
    private javax.swing.JLabel backnav;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnjadwal;
    private javax.swing.JLabel btnout;
    private javax.swing.JLabel btntambah;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labDaf;
    private javax.swing.JLabel labTipe;
    private javax.swing.JLabel labharga;
    private javax.swing.JLabel labjmlkursi;
    private javax.swing.JLabel labplat;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nav;
    private javax.swing.JLabel pt;
    private javax.swing.JTextField tfTipe;
    private javax.swing.JTextField tfharga;
    private javax.swing.JTextField tfjmlkursi;
    private javax.swing.JTextField tfplat;
    // End of variables declaration//GEN-END:variables
}
