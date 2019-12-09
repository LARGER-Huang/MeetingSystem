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
 * @Date 2019-12-05 15:18
 */
@WebServlet(name = "UserMeetingDelete")
public class UserMeetingDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meetingId=request.getParameter("meetingId");
        String id=(String)request.getSession().getAttribute("user_ID");

        UserDao userDao=new UserDao();
        try {
            User user=userDao.getUserByMeetingId(meetingId,id);

            if(user==null){         //用户删除会议不存在

                request.getRequestDispatcher("UserMeetingSelect.jsp").forward(request, response);
            }
            else{

                userDao.delete(id,meetingId);
                request.getRequestDispatcher("UserMeeting.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
