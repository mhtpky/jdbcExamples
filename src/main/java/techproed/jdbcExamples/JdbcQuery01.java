package techproed.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// import java.sql.*; >> tum kutuphaneyi ekleyip tektek importla ugrasilmayabilir 
// fakat cok fazla sey ekleyecegi icin cok efektif degildir

public class JdbcQuery01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// 1.ADIM : ilgili driver yukleme
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2) Veritabani baglantisi olustur
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "hr","hr1");
		
		//3) SQL komutlari icin bir Statement nesnesi olustur.
		Statement st = con.createStatement();
		
		//4)Sorgu ifadesini calistir. ( Personel tablosundaki id=7369 olan personelin ismini sorgula)
		ResultSet rs1 = st.executeQuery("SELECT personel_isim, maas FROM personel WHERE personel_id=7369");
		
		//5)Sonuclari al ve isle
		while(rs1.next()) {
			System.out .println("Personel Adi : " + rs1.getString("personel_isim"));
			System.out .println("Personel Adi : " + rs1.getString(1)+ "\nMaas: "+ rs1.getString(2));
		}
		
		//6) Olusturulan nesneleri bellekten kaldir.
		st.close();
		con.close();
		rs1.close();
	}

}
