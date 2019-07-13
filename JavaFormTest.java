package login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JavaFormTest extends HttpServlet {
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.isEmpty())
            out.println("name is empty!<br />");
        else
            out.println("name:" + username + "<br />");

        if (password.isEmpty())
            out.println("password is empty!<br />");
        else
            out.println("password:" + password + "<br />");
        }
        
        
    }
