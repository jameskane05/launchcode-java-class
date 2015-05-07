/**
 * Created by jameskane on 5/7/15.
 */
public class MathProblem extends Question {

    private String equation;

    public MathProblem(String equation) {
        super("Solve for x: ", "3");
        this.equation = equation;
    }

    public String getEquation() {
        return this.equation;
    }
}
