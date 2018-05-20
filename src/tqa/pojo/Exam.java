/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

/**
 *
 * @author YUGAL
 */
public class Exam {
    private String examID;
    private String Launguae;
    private int totalQuestion;

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getLaunguae() {
        return Launguae;
    }

    public void setLaunguae(String Launguae) {
        this.Launguae = Launguae;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public Exam(String examID, String Launguae, int totalQuestion) {
        this.examID = examID;
        this.Launguae = Launguae;
        this.totalQuestion = totalQuestion;
    }
}
