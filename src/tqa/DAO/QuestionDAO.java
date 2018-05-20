/*
 * Created By Yugal Kukde
 */
package tqa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tqa.DButil.DBConnection;
import tqa.pojo.Question;
import tqa.pojo.QuestionStore;

/**
 *
 * @author YUGAL
 */
public class QuestionDAO {

    public static void addQuestion(QuestionStore q) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Question> queList = q.getllQuestion();
        for (Question que : queList) {
            ps.setString(1, que.getExamId());
            ps.setInt(2, que.getQno());
            ps.setString(3, que.getQuestion());
            ps.setString(4, que.getAns1());
            ps.setString(5, que.getAns2());
            ps.setString(6, que.getAns3());
            ps.setString(7, que.getAns4());
            ps.setString(8, que.getCorrectAns());
            ps.setString(9, que.getLanguage());
            ps.executeUpdate();
        }
    }

    public static ArrayList<Question> getQuestionsByExamId(String ExamID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        ArrayList<Question> queList = new ArrayList<>();
        PreparedStatement ps = conn.prepareStatement("select * from questions where examid=? order by qno");
        ps.setString(1, ExamID);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int qno = rs.getInt(2);
            String examid = rs.getString(1);
            String question = rs.getString(3);
            String option1 = rs.getString(4);
            String option2 = rs.getString(5);
            String option3 = rs.getString(6);
            String option4 = rs.getString(7);
            String correctOption = rs.getString(8);
            String language = rs.getString(9);
            Question que = new Question(examid, qno, language, option1, option2, option3, option4, correctOption, question);
            queList.add(que);
        }
        return queList;
    }
    public static void updateQuestion(QuestionStore qstore) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update questions set question=?,ans1=?,ans2=?,ans3=?,ans4=?,correct_ans=? where examid=? and qno=? and language=?");
        ArrayList<Question> queList = qstore.getllQuestion();
        for (Question que : queList) {
            ps.setString(1, que.getQuestion());
            ps.setString(2, que.getAns1());
            ps.setString(3, que.getAns2());
            ps.setString(4, que.getAns3());
            ps.setString(5, que.getAns4());
            ps.setString(6, que.getCorrectAns());           
            ps.setString(7, que.getExamId());
            ps.setInt(8, que.getQno());
            ps.setString(9, que.getLanguage());
            ps.executeUpdate();
        }
    }
}
