/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package İsKatmani.VeriTransferFonksiyonlari;

import VeriKatmani.javaBaglanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import İsKatmani.KitapHareketleri;

/**
 *
 * @author Samet
 */
public class KitapAlisVerisFunc {
    
    public KitapAlisVerisFunc(){
    
    }
    Connection baglan = javaBaglanti.Baglanti();;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    public void ekle(KitapHareketleri gelen){
        String sql = "INSERT INTO KitapHareketleri(Uye_Id,Kit_Id,VerilisTarihi) VALUES("+gelen.Uye_Id +","+gelen.Kit_Id+",'"+gelen.VerilisTarihi+"')";
        String sql2 = "UPDATE Kitaplar SET stok=0 WHERE Id="+gelen.Kit_Id;
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt = baglan.prepareStatement(sql2);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Kitap Öğrenciye Verildi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void guncelle(KitapHareketleri gelen){
        String sql = "UPDATE KitapHareketleri SET TeslimTarihi='"+gelen.TeslimTarihi+"' WHERE Uye_Id="+gelen.Uye_Id+" And Kit_Id="+gelen.Kit_Id;
        String sql2 = "UPDATE Kitaplar SET stok=1 WHERE Id="+gelen.Kit_Id;
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt = baglan.prepareStatement(sql2);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Kitap Öğrenciden Teslim Alındı");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
