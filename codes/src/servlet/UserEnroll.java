package servlet;

import DAO.UserDao;
import VO.Org;
import VO.User;

import javax.print.DocFlavor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-11-26 20:57
 */
@WebServlet(name = "UserEnroll")
public class UserEnroll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meetingId=request.getParameter("meetingId");
        String id=request.getParameter("id");

        UserDao userDao=new UserDao();
        try {
            Org org=userDao.getByMeetingId(meetingId);
            User user=userDao.getUserByMeetingId(meetingId,id);
            if(org==null){          //会议号不存在
                request.setAttribute("user_ID",id);   
                request.getRequestDispatcher("wrongUserLogin.jsp").forward(request, response);
            }
            if(user!=null){         //用户重复报名会议
                request.setAttribute("user_ID",id);
                request.getRequestDispatcher("wrongUserLogin.jsp").forward(request, response);
            }
            else{
                request.setAttribute("user_ID",id);
                request.setAttribute("org",org);
                request.getRequestDispatcher("UserEnroll.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
