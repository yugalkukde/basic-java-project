/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

import java.util.ArrayList;

/**
 *
 * @author YUGAL
 */
public class AnswerStore {

    ArrayList<Answer> answerList;

    public AnswerStore() {
        answerList = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answerList.add(answer);
    }

    public Answer getAnswer(int pos) {
        return answerList.get(pos);
    }

    public void removeAnswer(int pos) {
        answerList.remove(pos);
    }

    public void setAnswerAt(int pos, Answer ans) {
        answerList.add(pos, ans);
    }

    public ArrayList<Answer> getAllAnswers() {
        return answerList;
    }

    public Answer getAnswerByQno(int qno) {
        for (Answer ans : answerList) {
            if (ans.getQno() == qno) {
                return ans;
            }
        }
        return null;
    }

    public int removeAnswer(Answer ans) {
        int pos = answerList.indexOf(ans);
        return pos;
    }

    public int getCount() {
        return answerList.size();
    }
}
