/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

/**
 *
 * @author YUGAL
 */
public class Performance {
    private String userid;
    private String examid;
    private int right;
    private int wrong;
    private int unattempted;
    private double percentage;
    private String language;

    public Performance() {
    }

    public Performance(String userid, String examid, int right, int wrong, int unattempted, double percentage, String language) {
        this.userid = userid;
        this.examid = examid;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.percentage = percentage;
        this.language = language;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPercantage() {
        return percentage;
    }

    public void setPercantage(double percantage) {
        this.percentage = percantage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
