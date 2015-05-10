/**
 * Created by jameskane on 5/7/15.
 */
public class MathProblem extends Question {

    private String equation;

    public MathProblem(String question, String equation, String answer) {
        super(question, answer);
        this.equation = equation;
    }

    public String getEquation() {return this.equation;}

    public void setEquation(String equation) {this.equation = equation;}

}
