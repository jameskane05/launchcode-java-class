/**
 * Created by jameskane on 5/7/15.
 */
public class Question {

    private String question;
    private String answer;

    //Constructor function - tested
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question; //tested
    }

    public String getAnswer() {
        return this.answer;
    }
}
