package DAO;

import VO.Org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @Author Huang J.X
 * @Date 2019-11-23 21:47
 */
public class OrgDao {
    //定义数据库驱动类
    public String driver = "com.mysql.jdbc.Driver" ;
    //定义数据库连接URL
    public String url = "jdbc:mysql://localhost:3306/meeting" ;
    //定义数据库连接用户名
    public  String user = "root" ;
    //定义数据库连接密码
    public  String password= "0009" ;
    //定义数据库连接对象
    public  Connection conn = null ;

    public void initConnection() throws Exception{
        Class.forName(driver);
        this.conn = DriverManager.getConnection(url,user,password) ;
    }

    public Org getOrgById(String ID)throws Exception{
        Org org=null;
        initConnection();
        String sql="SELECT * FROM org WHERE org_ID=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,ID);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            org=new Org();
            org.setOrg_ID(rs.getString("org_ID"));
            org.setOrg_password(rs.getString("org_password"));
        }
        this.closeConnection();
        return org;
    }

    public void insert(Org org) throws Exception {
        initConnection();
        String sql="insert into org values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,org.getOrg_ID());
        ps.setString(2,org.getOrg_password());
        ps.setString(3,org.getMeetingId());
        ps.setString(4,org.getDate());
        ps.setString(5,org.getPlace());
        ps.setString(6,org.getSpeaker());
        ps.setString(7,org.getHotel());
        ps.setString(8,org.getUserName());
        ps.setString(9,org.getUserSex());
        ps.setString(10,org.getUserIdCard());
        ps.setString(11,org.getUserTel());
        ps.setString(12,org.getUserRoom());
        ps.setString(13,org.getUserWorkplace());
        ps.setString(14,org.getDate());
        ps.executeUpdate();
        this.closeConnection();
    }

    public ArrayList searchMeeting() throws Exception {
        initConnection();
        ArrayList<Org> meeting=new ArrayList();
        String sql="SELECT * FROM org ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            Org org=new Org();
            org.setOrg_ID(rs.getString("org_ID"));
            org.setMeetingId(rs.getString("meetingId"));
            org.setDate(rs.getString("date"));
            org.setPlace(rs.getString("place"));
            org.setSpeaker(rs.getString("speaker"));
            org.setHotel(rs.getString("hotel"));
            org.setUserName(rs.getString("userName"));
            org.setUserSex(rs.getString("userSex"));
            org.setUserIdCard(rs.getString("userIdCard"));
            org.setUserTel(rs.getString("userTel"));
            org.setUserRoom(rs.getString("userRoom"));
            org.setUserWorkplace(rs.getString("userWorkplace"));
            org.setUserDate(rs.getString("userDate"));

            meeting.add(org);
        }
        this.closeConnection();
        return meeting;
    }

    public StringBuilder meeting() throws Exception {
        initConnection();
        StringBuilder meeting=new StringBuilder("会议号 组织者号 会议日期 会议地点 演讲人 宾馆");
        String sql="SELECT * FROM org where meetingId is not null" ;
        PreparedStatement ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            meeting.append("\n");
            meeting.append(rs.getString("org_ID")+" ");
            meeting.append(rs.getString("meetingId")+" ");
            meeting.append(rs.getString("date")+" ");
            meeting.append(rs.getString("place")+" ");
            meeting.append(rs.getString("speaker")+" ");
            meeting.append(rs.getString("hotel")+" ");
        }
        this.closeConnection();
        return meeting;
    }

    public ArrayList searchOrgMeeting(String org_ID) throws Exception {
        initConnection();
        ArrayList<Org> meeting=new ArrayList();
        String sql="SELECT * FROM org where org_ID=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,org_ID);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            Org org=new Org();
            org.setOrg_ID(rs.getString("org_ID"));
            org.setMeetingId(rs.getString("meetingId"));
            org.setDate(rs.getString("date"));
            org.setPlace(rs.getString("place"));
            org.setSpeaker(rs.getString("speaker"));
            org.setHotel(rs.getString("hotel"));
            org.setUserName(rs.getString("userName"));
            org.setUserSex(rs.getString("userSex"));
            org.setUserIdCard(rs.getString("userIdCard"));
            org.setUserTel(rs.getString("userTel"));
            org.setUserRoom(rs.getString("userRoom"));
            org.setUserWorkplace(rs.getString("userWorkplace"));
            org.setUserDate(rs.getString("userDate"));
            meeting.add(org);
        }
        this.closeConnection();
        return meeting;
    }

    public void OrgMeetingDelete(String id,String meetingId) throws Exception {
        initConnection();
        String sql1="delete from org where org_ID=? and meetingId=?";
        String sql2="delete from user where meetingId=?";
        PreparedStatement ps1=conn.prepareStatement(sql1);
        ps1.setString(1,id);
        ps1.setString(2,meetingId);
        ps1.executeUpdate();

        PreparedStatement ps2=conn.prepareStatement(sql2);
        ps2.setString(1,meetingId);
        ps2.executeUpdate();
        this.closeConnection();
    }

    public void OrgMeetingUpdate(Org org) throws Exception {
        initConnection();
        String sql="update org set date=?,place=?,speaker=?," +
                "hotel=?,userName=?,userSex=?,userIdCard=?,userTel=?,userRoom=?," +
                "userWorkPlace=? where org_ID=? and meetingId=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,org.getDate());
        ps.setString(2,org.getPlace());
        ps.setString(3,org.getSpeaker());
        ps.setString(4,org.getHotel());
        ps.setString(5,org.getUserName());
        ps.setString(6,org.getUserSex());
        ps.setString(7,org.getUserIdCard());
        ps.setString(8,org.getUserTel());
        ps.setString(9,org.getUserRoom());
        ps.setString(10,org.getUserWorkplace());
        ps.setString(11,org.getOrg_ID());
        ps.setString(12,org.getMeetingId());
        ps.executeUpdate();
        this.closeConnection();
    }

    public void closeConnection() throws Exception{
        conn.close();
    }
}
