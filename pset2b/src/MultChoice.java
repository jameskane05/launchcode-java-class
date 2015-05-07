/**
 * Created by jameskane on 5/7/15.
 */


// subclass or derived class of Question.java
public class MultChoice extends Question {

    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String altAnswer;
    private String altAnswer2;

    // primary constructor function for subclass MultChoice
    public MultChoice(String choiceA, String choiceB, String choiceC) {
        super("Which color do you like best?", choiceA);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
    }

    // alternative constructor function for MultChoice questions w/ two correct answers
    public MultChoice(String choiceA, String choiceB, String choiceC, String altAnswer) {
        super("Which color do you like best?", choiceA);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.altAnswer = altAnswer;
    }

    // alternative constructor function for MultChoice questions w/ three correct answers
    public MultChoice(String choiceA, String choiceB, String choiceC, String altAnswer, String altAnswer2) {
        super("Which color do you like best?", choiceA);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.altAnswer = altAnswer;
        this.altAnswer2 = altAnswer2;
    }

    public String getChoiceA() {
        return this.choiceA;
    }

    public String getChoiceB() {
        return this.choiceB;
    }

    public String getChoiceC() {
        return this.choiceC;
    }

    public String getAltAnswer() {
        return this.altAnswer;
    }

    public String getAltAnswer2() {
        return this.altAnswer2;
    }
}
