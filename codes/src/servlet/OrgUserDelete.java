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
 * @Date 2019-12-05 21:31
 */
@WebServlet("/OrgUserDelete")
public class OrgUserDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meetingId=(String)request.getSession().getAttribute("meetingId");
        String user_ID=request.getParameter("user_ID");

        UserDao userDao=new UserDao();
        try {
            userDao.delete(user_ID,meetingId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("OrgUserMeeting.jsp").forward(request, response);

    }
}
