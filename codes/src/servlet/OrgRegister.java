package servlet;

import DAO.OrgDao;
import DAO.UserDao;
import VO.Org;
import VO.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 22:19
 */
@WebServlet("/OrgRegister")
public class OrgRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String password=request.getParameter("password");

        OrgDao orgDao=new OrgDao();
        Org org= null;
        try {
            org = orgDao.getOrgById(id);
            if(org==null){
                org=new Org();
                org.setOrg_ID(id);
                org.setOrg_password(password);
                orgDao.insert(org);
                request.getRequestDispatcher("AdminMeeting.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("OrgRegister.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
