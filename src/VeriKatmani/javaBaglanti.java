package VeriKatmani;





/**
 *
 * @author sametozeren
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaBaglanti {
    public static Connection Baglanti(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection baglan = DriverManager.getConnection("jdbc:sqlite:D:\\Kutuphane\\kutuphane.sqlite");
            return baglan;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }  
    }
}
