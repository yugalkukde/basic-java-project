/*
 * Created By Yugal Kukde
 */
package tqa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import tqa.DButil.DBConnection;
import tqa.pojo.Performance;
import tqa.pojo.StudentScore;

/**
 *
 * @author YUGAL
 */
public class PerformanceDAO {

    public static ArrayList<String> getAllStudentId() throws SQLException {
        ArrayList<String> stuList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select distinct userid from performance");
        while (rs.next()) {
            stuList.add(rs.getString(1));
        }
        return stuList;
    }

    public static ArrayList<String> getAllExamId(String str) throws SQLException {
        ArrayList<String> examList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from performance where userid=?");
        ps.setString(1, str);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            examList.add(rs.getString(1));
        }
        return examList;
    }

    public static StudentScore getScore(String userId, String examId) throws SQLException {
        StudentScore stuScore = new StudentScore();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select per,language from performance where userid=? and examid=?");
        ps.setString(1, userId);
        ps.setString(2, examId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            stuScore.setPercentage(rs.getDouble(1));
            stuScore.setLanguage(rs.getString(2));
        }
        return stuScore;
    }

    public static ArrayList<Performance> getAllData() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ArrayList<Performance> allList = new ArrayList<>();
        ResultSet rs = st.executeQuery("select * from performance");
        while (rs.next()) {
            Performance pr = new Performance();
            pr.setUserid(rs.getString(1));
            pr.setExamid(rs.getString(2));
            pr.setRight(rs.getInt(3));
            pr.setWrong(rs.getInt(4));
            pr.setUnattempted(rs.getInt(5));
            pr.setPercantage(rs.getDouble(6));
            pr.setLanguage(rs.getString(7));
            allList.add(pr);
        }
        return allList;
    }

    public static void addPerformance(Performance perform) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1, perform.getUserid());
        ps.setString(2, perform.getExamid());
        ps.setInt(3, perform.getRight());
        ps.setInt(4, perform.getWrong());
        ps.setInt(5, perform.getUnattempted());
        ps.setDouble(6, perform.getPercantage());
        ps.setString(7, perform.getLanguage());
        ps.executeUpdate();
    }
}
