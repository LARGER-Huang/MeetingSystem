package servlet;

import DAO.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 22:13
 */
@WebServlet("/AdminUserDelete")
public class AdminUserDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meetingId=request.getParameter("meetingId");
        String user_ID=request.getParameter("user_ID");

        UserDao userDao=new UserDao();
        try {
            userDao.delete(user_ID,meetingId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("AdminUserMeeting.jsp").forward(request, response);

    }
}
