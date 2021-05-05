package techproed.jdbcExamples;

import java.sql.*; // Tum JDBC methodlarini eklemek icin

public class JdbcQuery02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521/XE";

		Class.forName("oracle.jdbc.driver.OracleDriver"); // driver

		Connection con = DriverManager.getConnection(url, "hr", "hr1"); // connection

		Statement st = con.createStatement(); // statement

		// Bolumler tablosunda ki tum kayitlari listeleyen bir sorgu yaziniz
		String selectQuery = "SELECT * FROM bolumler";
		ResultSet tablo1 = st.executeQuery(selectQuery);

		while (tablo1.next()) {
			System.out.println(tablo1.getInt(1) + " " + tablo1.getString(2) + " " + tablo1.getString(3));
		}

		System.out.println("================================");

		/*
		 * =======================================================================
		 * ORNEK2: SATIS ve MUHASABE bolumlerinde calisan personelin isimlerini ve
		 * maaslarini maas sirali olarak listeleyiniz
		 * ========================================================================
		 */

		String q2 = "SELECT personel_isim,maas" + " FROM personel" + " WHERE bolum_id IN(10,30)"
				+ " ORDER BY maas DESC";

		ResultSet tablo2 = st.executeQuery(q2);

		while (tablo2.next()) {
			System.out.println("ISIM : " + tablo2.getString(1) + "\t MAAS : " + tablo2.getInt(2));
		}

		st.close();
		con.close();
		tablo1.close();
		tablo2.close();
	}

}
