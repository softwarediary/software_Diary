package diary ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiaryActivity extends HttpServlet{
	protected void doPost(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
		String title = request.getParameter("title");

		String content = request.getParameter("content");
		
			
	   DiaryService op=new DiaryService();
	   
	   
	   try {
	   op.save(new Diary(title,content,1));
	   } catch (ClassNotFoundException e) {
	   e.printStackTrace();}
	   if(content.isEmpty()||title.isEmpty())
		{
			out.println("content is null!<br/>");
		response.sendRedirect("http://localhost:8080/Mydiary/newdiary.html");
		return;
		}
		else{
			out.println("content:" + content + "<br/>");
		response.sendRedirect("http://localhost:8080/Mydiary/diary.html");
	    return;
		}
	}
}


       

       