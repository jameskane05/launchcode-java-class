/**
 * Created by jameskane on 5/7/15.
 */
public class Question {

    private String question;
    private String answer;

    //Constructor function
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setQuestion(String question) { this.question = question; }

    public void setAnswer(String answer) { this.answer = answer; }

}
