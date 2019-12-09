package servlet;

import DAO.UserDao;
import VO.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Huang J.X
 * @Date 2019-11-21 10:22
 */
@WebServlet(name = "UserLogin")
public class UserLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        String ID=request.getParameter("user_ID");
        String password=request.getParameter("user_password");


        if(ID.equals("")||password.equals("")){
            response.sendRedirect("wrongLogin.jsp");
    }
        else{
            //指定按ID查询
        UserDao userDAO =new UserDao();
        User user= null;
        try {
            user = userDAO.getUserById(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(user==null||!user.getUser_password().equals(password)){
            response.sendRedirect("wrongLogin.jsp");
        }
        else{
            request.setAttribute("user_ID",ID);
            request.getSession().setAttribute("user_ID",ID);
            request.getRequestDispatcher("UserLogin.jsp").forward(request, response);
        }
        }

    }
}
