/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

import java.util.ArrayList;

/**
 *
 * @author YUGAL
 */
public class QuestionStore {

    ArrayList<Question> qusetionList;

    public QuestionStore() {
        qusetionList = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        qusetionList.add(q);
    }

    public Question getQuestion(int pos) {
        return qusetionList.get(pos);
    }

    public void removeQuestion(int pos) {
        qusetionList.remove(pos);
    }

    public void setQuestionAt(Question q, int pos) {
        qusetionList.add(pos, q);
    }

    public ArrayList<Question> getllQuestion() {
        return qusetionList;
    }

    public int getCount() {
        return qusetionList.size();
    }
}
