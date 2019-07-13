package diary;

import java.util.ArrayList;
import java.util.List;


import java.sql.*;

public class DiaryService {
   
	String url = "jdbc:mysql://localhost:3306/diary";
    String user ="root";//替换成你自已的数据库用户名
    String password = "123456";//这里替换成你自已的数据库用户密码
    
	public void save(Diary d) throws ClassNotFoundException{
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
	        System.out.println( "加载驱动成功!" );

	      Connection con = DriverManager.getConnection(this.url, this.user, password);

	        System.out.println( "连接数据库成功!" );
	    	
	  String s = "insert  into diary1(title,content,pubdate,userid,visible) values(?,?,current_time(),2,?) ";

	  PreparedStatement ps=con.prepareStatement(s);
	        
		ps=con.prepareStatement(s);
		

		ps.setString(1,d.getTitle());
		ps.setString(2,d.getContent());
	//	ps.setString(4,diary.getPubdate());
	//	ps.setString(3,diary.getUserid() );
		ps.setInt(3,d.Visible);
		 ps.executeUpdate();
		 System.out.println( "插入数据库成功!" );
	        con.close();
		}
		catch(SQLException e){
    		System.out.println("ErrorCode:"+e.getErrorCode());
    		System.out.println("SQLState:"+e.getSQLState());
    		System.out.println("reason:"+e.getMessage());    
    		
    }

	}


}

