package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operate extends HttpServlet{
	private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;//��������洢��ѯ����Ķ���
    public  void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{    //��¼����
    	request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String userID=request.getParameter("username");
        String password=request.getParameter("password");
        int i = 3;
         while(i!=-1){
            if(checkUserLogin(userID,password)){    //�Ƚ�������û����������Ƿ�ͳ�ʼֵ��ͬ
                response.sendRedirect("http://localhost:8080/Mydiary/index.html");
                return;
                
            }
            else{
                if(i == 0){      //���ε�½�����˳�ϵͳ
                    System.exit(1);
                }
                i--;
                response.sendRedirect("http://localhost:8080/Mydiary/signin.html");
                return;
            }
         }
         
    }
    public  boolean checkUserLogin(String userID,String userpwd){  //����˺��������Ƿ�ƥ��
        boolean flag = false;
        //User user = null;
        try{
            conn = DBConn.createDBConn();
            String sql = "select * from user where userID=? and userpassword=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userID);
            ps.setString(2, userpwd);//��java.sql.connection��������ṩ��sql�ַ����л�ȡ��ps����
            rs = ps.executeQuery();
            flag = rs.next();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            DBConn.closeConn(conn);
        }
        return flag;
    }


}
