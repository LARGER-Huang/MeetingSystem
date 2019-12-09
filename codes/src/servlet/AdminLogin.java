package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 11:23
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("admin_ID");
        String password=request.getParameter("admin_password");
        if(id.equals("66666") && password.equals("666")){
            request.getRequestDispatcher("AdminMeeting.jsp").forward(request, response);
        }
        else{
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }


}
