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
import tqa.pojo.Exam;

/**
 *
 * @author YUGAL
 */
public class ExamDAO {

    public static String getExamID() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        int result = 0;
        ResultSet rs = st.executeQuery("select count(*) as totalrows from exam");
        while (rs.next()) {
            result = rs.getInt(1);
        }
        String str = "EX-" + (result + 1);
        return str;
    }

    public static void addExam(Exam newExam) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, newExam.getExamID());
        ps.setString(2, newExam.getLaunguae());
        ps.setInt(3, newExam.getTotalQuestion());
        ps.executeUpdate();
    }

    public static ArrayList<String> getExamIdBySubject(String subject) throws SQLException {
        Connection conn = DBConnection.getConnection();
        ArrayList<String> examList = new ArrayList<>();
        PreparedStatement ps = conn.prepareStatement("select examid from exam where language=?");
        ps.setString(1, subject);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            examList.add(rs.getString(1));
        }
        return examList;
    }

    public static int getQuestionCountByExam(String examId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select total_questions from exam where examid=?");
        ps.setString(1, examId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return (rs.getInt(1));
    }
}
