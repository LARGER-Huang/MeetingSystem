package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-12-05 21:22
 */
@WebServlet("/OrgUserMeeting")
public class OrgUserMeeting extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meetingId=request.getParameter("meetingId");
        request.getSession().setAttribute("meetingId",meetingId);
        request.setAttribute("meetingId",meetingId);
        request.getRequestDispatcher("OrgUserMeeting.jsp").forward(request, response);
    }
}
