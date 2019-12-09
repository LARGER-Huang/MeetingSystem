package servlet;

import DAO.OrgDao;
import DAO.UserDao;
import VO.Org;
import VO.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Huang J.X
 * @Date 2019-11-23 21:52
 */
@WebServlet(name = "OrgLogin")
public class OrgLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        String ID=request.getParameter("org_ID");
        String password=request.getParameter("org_password");


        if(ID.equals("")||password.equals("")){
            response.sendRedirect("wrongLogin.jsp");
        }
        else{
            //指定按ID查询
            OrgDao orgDAO=new OrgDao();
            Org org=null;
            try {
                org = orgDAO.getOrgById(ID);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(org==null||!org.getOrg_password().equals(password)){
                response.sendRedirect("wrongLogin.jsp");
            }
            else{
                request.setAttribute("org_ID",ID);
                request.getSession().setAttribute("org_ID",ID);
                request.getRequestDispatcher("OrgPublish.jsp").forward(request, response);

            }
        }
    }


}
