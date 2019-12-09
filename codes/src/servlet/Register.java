package servlet;

import DAO.UserDao;
import VO.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-11-26 17:34
 */
@WebServlet(name = "Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String password=request.getParameter("password");

        UserDao userDAO =new UserDao();
        try {
            User user= userDAO.getUserById(id);
            if(user==null){
                user=new User();
                user.setUser_ID(id);
                user.setUser_password(password);
                userDAO.insert(user);
                response.sendRedirect("wrongLogin.jsp");
            }
            else{
                response.sendRedirect("wrongRegister.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




    }


}
