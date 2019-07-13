package user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpinionActivity extends HttpServlet{
	protected void doPost(HttpServletRequest request,
    HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
		String Op_id = request.getParameter("Op_id");
		String Op_date = request.getParameter("Op_date");
		String Op_title = request.getParameter("Op_title");
		String Op_content = request.getParameter("Op_content");	
	    OpinionActivityService op=new OpinionActivityService(Op_id,Op_date,Op_title,Op_content);
	    try {
			op.save(this);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Op_content.isEmpty())
			out.println("content is null!<br/>");
		else
			out.println("content:" + Op_content + "<br/>");
		response.sendRedirect("http://localhost:8080/Mydiary/index.html");
	    return;
	}
	
}
