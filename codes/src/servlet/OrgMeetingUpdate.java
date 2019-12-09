package servlet;

import DAO.OrgDao;
import VO.Org;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 10:21
 */
@WebServlet("/OrgMeetingUpdate")
public class OrgMeetingUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String org_ID=request.getParameter("id");
        String meetingId=request.getParameter("meetingId");
        String date=request.getParameter("date");
        String place=request.getParameter("place");
        String speaker=request.getParameter("speaker");
        String hotel=request.getParameter("hotel");
        String userName=request.getParameter("userName");
        String userSex=request.getParameter("userSex");
        String userIdCard=request.getParameter("userIdCard");
        String userTel=request.getParameter("userTel");
        String userRoom=request.getParameter("userRoom");
        String userWorkplace=request.getParameter("userWorkplace");

        OrgDao orgDAO=new OrgDao();
        Org org=new Org();

        org.setOrg_ID(org_ID);
        org.setMeetingId(meetingId);
        org.setDate(date);
        org.setPlace(place);
        org.setSpeaker(speaker);
        org.setHotel(hotel);
        org.setUserName(userName);
        org.setUserSex(userSex);
        org.setUserIdCard(userIdCard);
        org.setUserTel(userTel);
        org.setUserRoom(userRoom);
        org.setUserWorkplace(userWorkplace);


        try {
            orgDAO.OrgMeetingUpdate(org);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("OrgMeeting.jsp").forward(request, response);
    }


}
