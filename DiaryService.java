package diary;

import java.util.ArrayList;
import java.util.List;


import java.sql.*;

public class DiaryService {
   
	String url = "jdbc:mysql://localhost:3306/diary";
    String user ="root";//�滻�������ѵ����ݿ��û���
    String password = "123456";//�����滻�������ѵ����ݿ��û�����
    
	public void save(Diary d) throws ClassNotFoundException{
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
	        System.out.println( "���������ɹ�!" );

	      Connection con = DriverManager.getConnection(this.url, this.user, password);

	        System.out.println( "�������ݿ�ɹ�!" );
	    	
	  String s = "insert  into diary1(title,content,pubdate,userid,visible) values(?,?,current_time(),2,?) ";

	  PreparedStatement ps=con.prepareStatement(s);
	        
		ps=con.prepareStatement(s);
		

		ps.setString(1,d.getTitle());
		ps.setString(2,d.getContent());
	//	ps.setString(4,diary.getPubdate());
	//	ps.setString(3,diary.getUserid() );
		ps.setInt(3,d.Visible);
		 ps.executeUpdate();
		 System.out.println( "�������ݿ�ɹ�!" );
	        con.close();
		}
		catch(SQLException e){
    		System.out.println("ErrorCode:"+e.getErrorCode());
    		System.out.println("SQLState:"+e.getSQLState());
    		System.out.println("reason:"+e.getMessage());    
    		
    }

	}


}

