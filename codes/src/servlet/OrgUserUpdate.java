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
 * @Date 2019-12-05 22:00
 */
@WebServlet("/OrgUserUpdate")
public class OrgUserUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_ID=request.getParameter("id");
        String name=request.getParameter("userName");
        String sex=request.getParameter("userSex");
        String idCard=request.getParameter("userIdCard");
        String tel=request.getParameter("userTel");
        String date=request.getParameter("date");
        String room=request.getParameter("userRoom");
        String workplace=request.getParameter("userWorkPlace");
        String meetingId=request.getParameter("meetingId");

        UserDao userDao= new UserDao();
        User user=new User();

        user.setUser_ID(user_ID);
        user.setName(name);
        user.setSex(sex);
        user.setIdCard(idCard);
        user.setTel(tel);
        user.setDate(date);
        user.setRoom(room);
        user.setWorkplace(workplace);
        user.setMeetingId(meetingId);

        try {
            userDao.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("OrgUserMeeting.jsp").forward(request, response);
    }


}
