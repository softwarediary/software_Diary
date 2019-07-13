package user;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class OpinionActivityService {
	String url = "jdbc:mysql://localhost:3306/diary";
	String user = "root";
	String password = "123456";
	String op_id,op_date,op_title,op_content;
    OpinionActivityService(String Op_id, String Op_date, String Op_title, String Op_content)
	{
		op_id = Op_id;
		op_date = Op_date;
		op_title = Op_title;
		op_content = Op_content;
	}
	public void save(OpinionActivity cn) throws ClassNotFoundException{
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("加载驱动成功！");
			
			Connection con = DriverManager.getConnection(this.url, this.user, password);
			
			System.out.println("连接数据库成功！");
			
			String s = "insert into OpinionActivity(Op_id, Op_date, Op_title, Op_content)values(?, current_time(), ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(s);
			
			ps = con.prepareStatement(s);
			
			
			
			ps.setString(1, op_id);
			//ps.setString(2, op_date);
			ps.setString(2, op_title);
			ps.setString(3, op_content);
			ps.executeUpdate();
			System.out.println("插入数据库成功！");
			con.close();
		}catch(SQLException e){
			System.out.println("ErrorCode:"+e.getErrorCode());
    		System.out.println("SQLState:"+e.getSQLState());
    		System.out.println("reason:"+e.getMessage());    
		}
	}
}
