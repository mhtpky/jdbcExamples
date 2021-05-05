package techproed.jdbcExamples;

public class DersNotlari {
	/*
	DERS OZETI:
	1.KISIM: MAVEN PROJE OLUSTURMA
	file/new project/mavenproject(wizarddan), cikmazsa other dan bak
	/next/catalogdan internal i sec,filter da maven-archetype-quickstart 1.1 i sec(en yuksek versiyon ne ise)
	/next/groupid(FIRMAADI):techproed 
	artifactid: (PROJEADI):JdbcDersler
	/finish
	 
	2.KISIM:POM AYARLARI ve PROJE UPDATE ETMEK
	    <dependencies>
	        <dependency>
	            <groupId>junit</groupId>
	            <artifactId>junit</artifactId>
	            <version>4.11</version>
	        </dependency>
	        <dependency>
	            <groupId>com.oracle.database.jdbc</groupId>
	            <artifactId>ojdbc10</artifactId>
	            <version>19.8.0.0</version>
	        </dependency>
	    </dependencies>
	    
	    POM AYARLARINA ORACLEDATABASEJDBC yi ekliyoruz
	    ben scope kismini sildim junitde cunku kullanmiyacagiz.
	Maven project olusturup Pom lari duzenledikten sonra save all,yapiyoruz
	sonra source yapip FORMAT yapiyoruz yine save varsa save edin.
	PROJE GUNCELLEMESI: projenin ustune sag tiklayip/Maven/UpdateProject i secin.
	
	3.KISIM) projenize gidin src deki sizin icin olusturulan paeti silin siz kendiniz
	istediginiz isimde paket olusturun.Ornek:JdbcTurkceDersler
	Paketin altina main method secerek class olusturun. Ornek:JdbcQuery01
	4.KISIM) SQL Structure nasil olacak?
	JDBC kullanarak nasil bir connection olusturabilirsin?
	              STRUCTURE OF JDBC
	              
	  1)import java.sql.*; (under package,import)
	             
	  2)Class.forName("oracle.jdbc.driver.OracleDriver");(choose throw declaration)
	  ----class ismini ekle demek...
	    
	  3)for Mac: Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain","oracleusername","oraclepassword");
	  for Windows:Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","oracleusername","oraclepassword");
	  (choose throw declaration)
	  (JDBC DE sadece 1 tane exception vardir oda SQLException dir.)
	  
	  4)  Statement st = con.createStatement();
	  
	  5)  ResultSet rs=st.executeQuery("SELECT * FROM tableName");
	  //bu kisim soruya gore degisir
	  //String q1="SELECT * FROM .....";   gibide ayri yazilip sonra
	  //ResultSet rs=st.executeQuery(q1); seklinde de yazilinabilinir.
	  
	     
	  
	  6)  //table da 1.olusturulan sutun string se rs.getString(1), numbersa rs.getInt(1) 1--->sutunnosu
	       //date ise rs.getDate(sutunno)
	      //ornek: 2.sutun int numbersa rs.getInt(2);
	      //yada soyle yapabilirsin 
	      //ornek: Select isim, id, maas;
	                       rs.getString("isim"), rs.getString("id"),rs.getDouble("maas")
	     // ya da rs.getString(1), rs.getString(2),rs.getDouble(3) seklinde yazariz
	     //tabii bunlari loopun icine ve systemout un icinde yazacagiz.
	     
	     //resultlarim birden cok loop la almam gerekli.
	     //bir deger olsa bile kursor donmesi icin next() olmasi lazim yani loop
	     
	     while(rs.next()) {
	     System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getInt(3));
	     }
	  
	  7) Butun connectionlari kapatmamiz gerekir, guvenlik acisindan.
	      
	      con.close();
	      st.close();
	      rs.close();
	  //herzaman ilk 4 asama ayni....
	  */
}
