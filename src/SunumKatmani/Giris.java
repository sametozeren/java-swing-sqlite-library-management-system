package SunumKatmani;


import VeriKatmani.javaBaglanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sametozeren
 */
public class Giris extends javax.swing.JFrame {
    Connection baglan;
    ResultSet rs;
    PreparedStatement pst;
    static int durum;
    
    public Giris() {
        super("Giriş Yap");
        initComponents();
        baglan = javaBaglanti.Baglanti();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisPaneli = new javax.swing.JPanel();
        girisSifreTxt = new javax.swing.JPasswordField();
        lblGirisKullaniciResim = new javax.swing.JLabel();
        lblGirisSifreResim = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        lblisim = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        txtGirisisim = new javax.swing.JTextField();
        btnOgrGiris = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBaslik1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsifre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsifre.setText("Şifre");

        lblisim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblisim.setText("Kullanıcı Adı");

        btnGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SunumKatmani/image/key.png"))); // NOI18N
        btnGiris.setText("Yönetici Giriş");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        btnOgrGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SunumKatmani/image/man (1).png"))); // NOI18N
        btnOgrGiris.setText("Öğrenci Giriş");
        btnOgrGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrGirisActionPerformed(evt);
            }
        });

        jLabel2.setText("Not:Öğrenci girişi için bilgileri doldurmanıza gerek yoktur");

        javax.swing.GroupLayout girisPaneliLayout = new javax.swing.GroupLayout(girisPaneli);
        girisPaneli.setLayout(girisPaneliLayout);
        girisPaneliLayout.setHorizontalGroup(
            girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisPaneliLayout.createSequentialGroup()
                        .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblisim)
                            .addComponent(lblsifre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOgrGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGirisisim)
                            .addComponent(girisSifreTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGirisKullaniciResim)
                            .addComponent(lblGirisSifreResim))
                        .addGap(39, 39, 39))
                    .addGroup(girisPaneliLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        girisPaneliLayout.setVerticalGroup(
            girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGirisKullaniciResim)
                    .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblisim)
                        .addComponent(txtGirisisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(girisPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsifre)
                    .addComponent(girisSifreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGirisSifreResim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOgrGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblBaslik1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBaslik1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SunumKatmani/image/bookshelf (1).png"))); // NOI18N
        lblBaslik1.setText("Kütüphanem");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Samet Özeren");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(girisPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBaslik1)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBaslik1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(lblLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(girisPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOgrGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrGirisActionPerformed
        // TODO add your handling code here:
        Giris.durum=0;
        setVisible(false);
        Yukleniyor yeni = new Yukleniyor();
        yeni.setYukleniyor();
        yeni.setVisible(true);
    }//GEN-LAST:event_btnOgrGirisActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        Giris.durum=1;
        String sql = "select * from Yoneticiler where kullaniciAdi=? and sifre=?";
        try {
            pst = baglan.prepareStatement(sql);
            pst.setString(1,txtGirisisim.getText());
            pst.setString(2,girisSifreTxt.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                rs.close();
                pst.close();
                setVisible(false);
                Yukleniyor yeni = new Yukleniyor();
                yeni.setYukleniyor();
                yeni.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Geçersiz Kullanıcı Adı Ve Şifre");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnOgrGiris;
    private javax.swing.JPanel girisPaneli;
    private javax.swing.JPasswordField girisSifreTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBaslik1;
    private javax.swing.JLabel lblGirisKullaniciResim;
    private javax.swing.JLabel lblGirisSifreResim;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblisim;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JTextField txtGirisisim;
    // End of variables declaration//GEN-END:variables
}
