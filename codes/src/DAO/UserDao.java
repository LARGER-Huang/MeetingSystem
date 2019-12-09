package DAO;

import VO.Org;
import VO.User;

import java.sql.*;
import java.util.ArrayList;

/**
 * @Author Huang J.X
 * @Date 2019-11-21 10:41
 */
public class UserDao {
    //定义数据库驱动类
    private final String driver = "com.mysql.jdbc.Driver" ;
    //定义数据库连接URL
    private final String url = "jdbc:mysql://localhost:3306/meeting" ;
    //定义数据库连接用户名
    private final String user = "root" ;
    //定义数据库连接密码
    private final String password= "0009" ;
    //定义数据库连接对象
    private Connection conn = null ;

    public void initConnection() throws Exception{
        Class.forName(driver);
        this.conn = DriverManager.getConnection(url,user,password) ;
    }

    public User getUserById(String ID)throws Exception{
        User user=null;
        initConnection();
        String sql="SELECT * FROM user WHERE user_ID=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,ID);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                user=new User();
                user.setUser_ID(rs.getString("user_ID"));
                user.setUser_password(rs.getString("user_password"));
                user.setName(rs.getString("name"));
                user.setSex(rs.getString("sex"));
                user.setIdCard(rs.getString("idCard"));
                user.setTel(rs.getString("tel"));
                user.setDate(rs.getString("date"));
                user.setRoom(rs.getString("room"));
                user.setWorkplace(rs.getString("workplace"));
                user.setMeetingId(rs.getString("meetingId"));
            }
            this.closeConnection();
            return user;
    }

    public void insert(User user) throws Exception {
        initConnection();
        String sql="insert into user values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user.getUser_ID());
        ps.setString(2,user.getUser_password());
        ps.setString(3,user.getName());
        ps.setString(4,user.getSex());
        ps.setString(5,user.getIdCard());
        ps.setString(6,user.getTel());
        ps.setString(7,user.getDate());
        ps.setString(8,user.getRoom());
        ps.setString(9,user.getWorkplace());
        ps.setString(10,user.getMeetingId());
        ps.executeUpdate();
        this.closeConnection();
    }

    public void update(User user) throws Exception {
        initConnection();
        String sql="update user set name=?,sex=?,idCard=?,tel=?,room=?,workplace=? where user_ID=?and meetingId=?";
        PreparedStatement ps=conn.prepareStatement(sql);

        ps.setString(1,user.getName());
        ps.setString(2,user.getSex());
        ps.setString(3,user.getIdCard());
        ps.setString(4,user.getTel());
        ps.setString(5,user.getRoom());
        ps.setString(6,user.getWorkplace());
        ps.setString(7,user.getUser_ID());
        ps.setString(8,user.getMeetingId());
        ps.executeUpdate();
        this.closeConnection();
    }

    public void delete(String id,String meetingId) throws Exception {
        initConnection();
        String sql="delete from user where user_ID=?and meetingId=?";
        PreparedStatement ps=conn.prepareStatement(sql);

        ps.setString(1,id);
        ps.setString(2,meetingId);
        ps.executeUpdate();
        this.closeConnection();
    }

    public Org getByMeetingId(String meetingId)throws Exception{
        Org org=null;
        initConnection();
        String sql="SELECT * FROM org WHERE meetingId=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,meetingId);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            org=new Org();
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
            org.setUserWorkplace(rs.getString("userWorkPlace"));
            org.setUserDate(rs.getString("userDate"));
        }
        this.closeConnection();
        return org;
    }

    public User getUserByMeetingId(String meetingId,String user_ID)throws Exception{
        User user=null;
        initConnection();
        String sql="SELECT * FROM user WHERE meetingId=? and user_ID=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,meetingId);
        ps.setString(2,user_ID);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            user=new User();
            user.setUser_ID(rs.getString("user_ID"));
            user.setName(rs.getString("name"));
            user.setSex(rs.getString("sex"));
            user.setIdCard(rs.getString("idCard"));
            user.setTel(rs.getString("tel"));
            user.setDate(rs.getString("date"));
            user.setRoom(rs.getString("room"));
            user.setWorkplace(rs.getString("workplace"));
            user.setMeetingId(rs.getString("meetingId"));
        }
        this.closeConnection();
        return user;
    }

    public ArrayList searchMeeting(String user_ID) throws Exception {
        initConnection();
        ArrayList<User> meeting=new ArrayList();
        String sql="SELECT * FROM user where user_ID=? ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user_ID);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            User user=new User();
            user.setUser_ID(rs.getString("user_ID"));
            user.setName(rs.getString("name"));
            user.setSex(rs.getString("sex"));
            user.setIdCard(rs.getString("idCard"));
            user.setTel(rs.getString("tel"));
            user.setDate(rs.getString("date"));
            user.setRoom(rs.getString("room"));
            user.setWorkplace(rs.getString("workplace"));
            user.setMeetingId(rs.getString("meetingId"));

            meeting.add(user);
        }
        this.closeConnection();
        return meeting;
    }

    public ArrayList searchUserMeeting(String meetingId) throws Exception {
        initConnection();
        ArrayList<User> meeting=new ArrayList();
        String sql="SELECT * FROM user where meetingId=? ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,meetingId);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            User user=new User();
            user.setUser_ID(rs.getString("user_ID"));
            user.setName(rs.getString("name"));
            user.setSex(rs.getString("sex"));
            user.setIdCard(rs.getString("idCard"));
            user.setTel(rs.getString("tel"));
            user.setDate(rs.getString("date"));
            user.setRoom(rs.getString("room"));
            user.setWorkplace(rs.getString("workplace"));
            user.setMeetingId(rs.getString("meetingId"));

            meeting.add(user);
        }
        this.closeConnection();
        return meeting;
    }



    public void closeConnection() throws Exception{
        conn.close();
    }
}
