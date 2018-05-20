/*
 * Created By Yugal Kukde
 */
package tqa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tqa.DButil.DBConnection;
import tqa.pojo.User;

/**
 *
 * @author YUGAL
 */
public class UserDAO {

    public static User login(User obj) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("select * from users where userid=? and password=?");
        ps.setString(1, obj.getUserid());
        ps.setString(2, obj.getPassword());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            obj.setUserid(rs.getString(1));
            obj.setUsertype(rs.getString(3));
        }
        return obj;
    }

    public static boolean addUser(User obj) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid=?");
        ps.setString(1, obj.getUserid());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return false;
        } else {
            ps = conn.prepareStatement("insert into users values(?,?,?)");
            ps.setString(1, obj.getUserid());
            ps.setString(2, obj.getPassword());
            ps.setString(3, "student");
            ps.executeUpdate();
            return true;

        }
    }
    public static boolean updateUser(String userId,String pass) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userId=?");
        ps.setString(1, pass);
        ps.setString(2, userId);
        int ans=ps.executeUpdate();
        return ans>0;
    }
}
