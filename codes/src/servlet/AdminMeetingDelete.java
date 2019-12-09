package servlet;

import DAO.OrgDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 22:08
 */
@WebServlet("/AdminMeetingDelete")
public class AdminMeetingDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String org_ID=request.getParameter("org_ID");
        String meetingId=request.getParameter("meetingId");

        OrgDao orgDao=new OrgDao();
        try {
            orgDao.OrgMeetingDelete(org_ID,meetingId);      //组织者会议删除
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("AdminMeeting.jsp").forward(request, response);
    }
}
