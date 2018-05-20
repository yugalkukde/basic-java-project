/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

import java.util.Objects;

/**
 *
 * @author YUGAL
 */
public class Question {

    private String examId;
    private int qno;
    private String language;
    private String Ans1,Ans2,Ans3,Ans4;
    private String correctAns;
    private String question;

    public Question(String examId, int qno, String language, String Ans1, String Ans2, String Ans3, String Ans4, String correctAns, String question) {
        this.examId = examId;
        this.qno = qno;
        this.language = language;
        this.Ans1 = Ans1;
        this.Ans2 = Ans2;
        this.Ans3 = Ans3;
        this.Ans4 = Ans4;
        this.correctAns = correctAns;
        this.question = question;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.Ans1, other.Ans1)) {
            return false;
        }
        if (!Objects.equals(this.Ans2, other.Ans2)) {
            return false;
        }
        if (!Objects.equals(this.Ans3, other.Ans3)) {
            return false;
        }
        if (!Objects.equals(this.Ans4, other.Ans4)) {
            return false;
        }
        if (!Objects.equals(this.correctAns, other.correctAns)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Question{" + "examId=" + examId + ", qno=" + qno + ", language=" + language + ", Ans1=" + Ans1 + ", Ans2=" + Ans2 + ", Ans3=" + Ans3 + ", Ans4=" + Ans4 + ", correctAns=" + correctAns + ", question=" + question + '}';
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAns1() {
        return Ans1;
    }

    public void setAns1(String Ans1) {
        this.Ans1 = Ans1;
    }

    public String getAns2() {
        return Ans2;
    }

    public void setAns2(String Ans2) {
        this.Ans2 = Ans2;
    }

    public String getAns3() {
        return Ans3;
    }

    public void setAns3(String Ans3) {
        this.Ans3 = Ans3;
    }

    public String getAns4() {
        return Ans4;
    }

    public void setAns4(String Ans4) {
        this.Ans4 = Ans4;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

}
