package person_message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.io.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operate1 extends HttpServlet{

    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{     //设置个人信息
    	request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String ID=request.getParameter("ID");
        String name=request.getParameter("name");
        String sex=request.getParameter("sex");
        String telephone=request.getParameter("telephone");
        String Jianjie=request.getParameter("jianjie");
        String email=request.getParameter("email");
        Person op=new Person(name,sex,telephone,Jianjie,email,ID);
        Operate1 ope=new Operate1();
    	op.updatename(name,ID);
    	op.updatesex(sex,ID);
    	op.updatephone(telephone,ID);
    	op.updateJianjie(Jianjie,ID);
    	op.updateemail(email,ID);
    	response.sendRedirect("http://localhost:8080/Mydiary/index.html");
    	return;
    }
  


}
