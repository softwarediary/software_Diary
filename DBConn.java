package login;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;
public class DBConn {
/*	  public static void main(String[] args)throws Exception {
      createDBConn();
      
      System.out.println("�ɹ�");
      Statement state = createDBConn().createStatement();
      System.out.println(state);
  }*/
    public static Connection createDBConn(){
        //�õ���������
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","123456");
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