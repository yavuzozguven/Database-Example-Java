package prolab2proje4;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prolab2Proje4 {

  
        
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DOMAIN_NAME = "localhost";
        static final String DB_NAME = "otomobil_yonetim";
        static final String DB_URL = "jdbc:mysql://localhost:3306/otomobil_yonetim";
        
        static final String USER = "root";
        static final String PASS = "";
        
    public static void main(String[] args) {
                Connection cnn = null;
                Statement stm = null;
                PreparedStatement psmt = null;
            
               
                int a=0;
                
                try {
                
                Class.forName("com.mysql.jdbc.Driver");
                cnn = DriverManager.getConnection(DB_URL, USER, PASS);
                String sql = "CREATE TABLE IF NOT EXISTS Tbl_Ilan"
                        + "(IlanID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Ilan_Adi varchar(100) NOT NULL DEFAULT ' ',"
                        + "Ilan_Fiyat int(11) NOT NULL DEFAULT 0,"
                        + "Ilan_Km int(11) NOT NULL DEFAULT 0,"
                        + "Ilan_Tarih varchar(20) NOT NULL DEFAULT ' ',"
                        + "Ilan_ArabaID int(11) NOT NULL DEFAULT 0,"
                        + "Ilan_SehirID int(11) NOT NULL DEFAULT 0)";
                String sql1 = "CREATE TABLE IF NOT EXISTS Tbl_Araba"
                        + "(ArabaID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Araba_Marka varchar(100) NOT NULL DEFAULT ' ',"
                        + "Araba_Model varchar(100) NOT NULL DEFAULT ' ',"
                        + "Araba_VitesTuruID int(11) NOT NULL DEFAULT 0,"
                        + "Araba_YakitTuruID int(11) NOT NULL DEFAULT 0,"
                        + "Araba_RenkID int(11) NOT NULL DEFAULT 0)";


String sql2 = "CREATE TABLE IF NOT EXISTS Tbl_YakitTuru"
                        + "(YakitTuruID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Yakit_Turu varchar(100) NOT NULL DEFAULT ' ')";

String sql3 = "CREATE TABLE IF NOT EXISTS Tbl_VitesTuru"
                        + "(VitesTuruID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Vites_Turu varchar(100) NOT NULL DEFAULT ' ')";

String sql4 = "CREATE TABLE IF NOT EXISTS Tbl_Renk"
                        + "(RenkID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Renk varchar(100) NOT NULL DEFAULT ' ')";

String sql5 = "CREATE TABLE IF NOT EXISTS Tbl_Sehir"
                        + "(SehirID int(11) AUTO_INCREMENT PRIMARY KEY,"
                        + "Sehir varchar(100) NOT NULL DEFAULT ' ')";
                
                psmt = cnn.prepareStatement(sql);
                int result = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql1);
                int result1 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql2);
                int result2 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql3);
                int result3 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql4);
                int result4 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql5);
                int result5 = psmt.executeUpdate();
                
                
                String sql_ilanaraba = "SELECT * from tbl_ilan";
                stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql_ilanaraba);
                while(rs.next()){
                    a = rs.getInt("IlanID");
                }
                
                if(a==0){
                
                String sql_yakitturu = "INSERT INTO tbl_yakitturu (Yakit_Turu) VALUES ('Benzin')";
                String sql_yakitturu2 = "INSERT INTO tbl_yakitturu (Yakit_Turu) VALUES ('Dizel')";
                String sql_yakitturu3 = "INSERT INTO tbl_yakitturu (Yakit_Turu) VALUES ('LPG')";
                psmt = cnn.prepareStatement(sql_yakitturu);
                int result_yakit = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_yakitturu2);
                int result_yakit2 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_yakitturu3);
                int result_yakit3 = psmt.executeUpdate();
                
                String sql_vitesturu = "INSERT INTO tbl_vitesturu (Vites_Turu) VALUES ('Manuel')";
                String sql_vitesturu2 = "INSERT INTO tbl_vitesturu (Vites_Turu) VALUES ('Otomatik')";
                psmt = cnn.prepareStatement(sql_vitesturu);
                int result_vites = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_vitesturu2);
                int result_vites2 = psmt.executeUpdate();
                
                String sql_sehir1 = "INSERT INTO tbl_sehir (Sehir) VALUES ('ISTANBUL')";
                String sql_sehir2 = "INSERT INTO tbl_sehir (Sehir) VALUES ('BURSA')";
                String sql_sehir3 = "INSERT INTO tbl_sehir (Sehir) VALUES ('KOCAELI')";
                String sql_sehir4 = "INSERT INTO tbl_sehir (Sehir) VALUES ('IZMIR')";
                String sql_sehir5 = "INSERT INTO tbl_sehir (Sehir) VALUES ('ANKARA')";
                String sql_sehir6 = "INSERT INTO tbl_sehir (Sehir) VALUES ('ANTALYA')";
                psmt = cnn.prepareStatement(sql_sehir1);
                int result_sehir1 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_sehir2);
                int result_sehir2 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_sehir3);
                int result_sehir3 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_sehir4);
                int result_sehir4 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_sehir5);
                int result_sehir5 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(sql_sehir6);
                int result_sehir6 = psmt.executeUpdate();
                
                
                String renk1 = "INSERT INTO tbl_renk (Renk) VALUES ('MAVI')";
                String renk2 = "INSERT INTO tbl_renk (Renk) VALUES ('SARI')";
                String renk3 = "INSERT INTO tbl_renk (Renk) VALUES ('KIRMIZI')";
                String renk4 = "INSERT INTO tbl_renk (Renk) VALUES ('SIYAH')";
                String renk5 = "INSERT INTO tbl_renk (Renk) VALUES ('BEYAZ')";
                String renk6 = "INSERT INTO tbl_renk (Renk) VALUES ('YESIL')";
                psmt = cnn.prepareStatement(renk1);
                int result_renk1 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(renk2);
                int result_renk2 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(renk3);
                int result_renk3 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(renk4);
                int result_renk4 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(renk5);
                int result_renk5 = psmt.executeUpdate();
                psmt = cnn.prepareStatement(renk6);
                int result_renk6 = psmt.executeUpdate();
                
                }
                
                
                
                
                
               
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Prolab2Proje4.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Prolab2Proje4.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         
                Main_Screen ms = new Main_Screen();
                ms.setVisible(true);
                
       
        
        
       
    }
    
}
