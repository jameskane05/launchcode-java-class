import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by jameskane on 5/7/15.
 */
public class TestQuestionsAndQuiz extends TestCase {

    @Test
    public void testQuestionAndAnswer() {
        Question test = new Question("What language is this code written in?", "Java");
        System.out.println("General question: " + test.getQuestion());
        System.out.println("General question answer: " + test.getAnswer());
    }

    public void testMultChoice() {
        MultChoice test = new MultChoice("Blue", "Red", "Yellow", "Red", "Yellow");
        System.out.println("MultChoice question: " + test.getQuestion());
        System.out.println("MultChoice choice A: " + test.getChoiceA());
        System.out.println("MultChoice choice B: " + test.getChoiceB());
        System.out.println("MultChoice choice C: " + test.getChoiceC());
        System.out.println("MultChoice answer: " + test.getAnswer());
        System.out.println("MultChoice alternative answer: " + test.getAltAnswer());
        System.out.println("MultChoice alternative answer #2: " + test.getAltAnswer2());
    }

    public void testMathProblem() {
        MathProblem test = new MathProblem("x + 2 / 5 = 1");
        System.out.println("MathProblem question: " + test.getQuestion());
        System.out.println("MathProblem equation: " + test.getEquation());
        System.out.println("MathProblem equation: " + test.getAnswer());
    }
}
