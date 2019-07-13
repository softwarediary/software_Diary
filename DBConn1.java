package person_message;

//与数据库相连

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;
public class DBConn1 {

	  public static Connection createDBConn(){
	      //得到数据连接
	      try{
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","123456");
	          return conn;
	      }catch(Exception e){
	          e.printStackTrace();
	          return null;
	      }
	  }
	  public static void closeConn(Connection conn){
	          try{
	              conn.close();
	          }catch(Exception e){
	              e.printStackTrace();
	          }
	  }
}