/**
 * Created by jameskane on 5/7/15.
 */

// subclass (aka derived class) of Question.java
public class MultChoice extends Question {

    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String altAnswer;
    private String altAnswer2;

    // primary constructor function for subclass MultChoice
    public MultChoice(String question, String choiceA, String choiceB, String choiceC, String answer) {
        super(question, answer);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
    }

    // alt constructor func for MultChoice questions w/ two correct answers
    public MultChoice(String question, String choiceA, String choiceB, String choiceC, String answer, String altAnswer) {
        super(question, answer);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.altAnswer = altAnswer;
    }

    // alt constructor func for MultChoice questions w/ three correct answers
    public MultChoice(String question, String choiceA, String choiceB, String choiceC, String answer, String altAnswer, String altAnswer2) {
        super(question, answer);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.altAnswer = altAnswer;
        this.altAnswer2 = altAnswer2;
    }

    //getters
    public String getChoiceA() {return this.choiceA;}
    public String getChoiceB() {return this.choiceB;}
    public String getChoiceC() {return this.choiceC;}
    public String getAltAnswer() {return this.altAnswer;}
    public String getAltAnswer2() {return this.altAnswer2;}

    //setters
    public void setChoiceA(String choice) {this.choiceA = choice;}
    public void setChoiceB(String choice) {this.choiceB = choice;}
    public void setChoiceC(String choice) {this.choiceC = choice;}
    public void setAltAnswer(String answer) {this.altAnswer = answer;}
    public void setAltAnswer2(String answer) {this.altAnswer2 = answer;}

}
