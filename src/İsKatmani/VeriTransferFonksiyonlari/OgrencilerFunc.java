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
import İsKatmani.Kitap;
import İsKatmani.Uye;

/**
 *
 * @author sametozeren
 */
public class OgrencilerFunc {
    public OgrencilerFunc(){
        //gerekli olursa kullanılacak
    }
    Connection baglan = javaBaglanti.Baglanti();;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    public void ekle(Uye ogrenci){
        String sql = "insert into Uyeler(isim,bolum,alan,yil,donem) values('"+ogrenci.isim+ "','"+ogrenci.bolum+"','"+ogrenci.alan+"',"+ogrenci.yil+","+ogrenci.donem+")";
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Yeni Öğrenci Başarıyla Kayıt Edilmiştir");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void guncelle(Uye uye){
        String sql = "UPDATE Uyeler SET isim='"+uye.isim+"', bolum='"+uye.bolum+"', alan='"+uye.alan+"',yil='"+uye.yil+"',donem='"+uye.donem+"' WHERE id="+uye.Id+"";
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Öğrenci Başarıyla Güncellendi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void sil(int id){
        String sql = "DELETE FROM Uyeler WHERE id="+id;
        try {
            stmt = baglan.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            baglan.close();
            JOptionPane.showMessageDialog(null, "Öğrencinin Kaydı Başarıyla Silindi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet listele(){
        String sql = "select * from Uyeler";
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public Uye ogrenciGetir(int id){
        String sql = "select * from Uyeler where id="+id;
        Uye yeni = new Uye();
        try {
            stmt = baglan.prepareStatement(sql);
            rs= stmt.executeQuery();
            if (rs.next()) {
                yeni.isim = rs.getString("isim");//veritabanı kolon isimleri;
                yeni.bolum = rs.getString("bolum");
                yeni.alan = rs.getString("alan");
                yeni.yil = rs.getString("yil");
                yeni.donem = rs.getString("donem");
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
