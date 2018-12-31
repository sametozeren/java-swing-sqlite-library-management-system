package İsKatmani.VeriTransferFonksiyonlari;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import VeriKatmani.javaBaglanti;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import İsKatmani.Kitap;

/**
 *
 * @author sametozeren
 */

public class KitaplarFunc {
    public KitaplarFunc(){
        //gerekli olursa kullanılacak
    }
    Connection baglan = javaBaglanti.Baglanti();;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    public void ekle(Kitap kitap){
        String sql = "insert into Kitaplar(isim,baski,yayimci,sayfasayisi,stok) values('"+kitap.isim+ "',"+kitap.baski+",'"+kitap.yayimci+"',"+kitap.sayfasayisi+",1)";
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Kitap Başarıyla Eklenmiştir");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void guncelle(Kitap kitap){
        String sql = "UPDATE Kitaplar SET isim='"+kitap.isim+"', baski="+kitap.baski+", yayimci='"+kitap.yayimci+"',sayfasayisi="+kitap.sayfasayisi+",stok="+kitap.stok+" WHERE id="+kitap.Kitap_ID+"";
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Kitap Başarıyla Güncellendi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void sil(int id){
        String sql = "DELETE FROM Kitaplar WHERE id="+id;
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Kitap Başarıyla Silindi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet listele(){
        String sql = "select * from Kitaplar";
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public ResultSet stokListele(){
        String sql = "select * from Kitaplar where stok=1";
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public ResultSet stokDisiListele(){
        String sql = "select * from Kitaplar where stok=0";
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public Kitap kitapGetir(int id){
        String sql = "select * from Kitaplar where id="+id;
        Kitap yeni = new Kitap();
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
            if (rs.next()) {
                yeni.isim = rs.getString("isim");//veritabanı kolon isimleri;
                yeni.baski = rs.getInt("baski");
                yeni.yayimci = rs.getString("yayimci");
                yeni.sayfasayisi = rs.getInt("sayfasayisi");
            }
            stmt.close();
            baglan.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return yeni;
    }
}
