import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 * Created by jameskane on 5/7/15. Please enjoy.
 */

public class Quiz {

    private static Component frame;


    public static void main (String[] args) {

        // track correct answers
        int rightAnswers = 0;

        // instantiate three question/answer pairs
        Question question1 = new Question("What is (fictional) real name of Iron Man?", "Tony Stark");
        MultChoice question2 = new MultChoice("What is your favorite color?", "Blue", "Red", "Yellow", "Blue", "Red", "");
        MathProblem question3 = new MathProblem("Solve for x:", "x + 2 / 5 = 1", "3");

        checkAnswer(question1.getAnswer(), displayQuestion(question1));
        checkMultAnswer(question2, displayMultChoice(question2));
        checkAnswer(question3.getAnswer(), displayMathProblem(question3));
    }

    public static String displayQuestion(Question question) {

        JOptionPane.showMessageDialog(frame, question.getQuestion(), "Dumb Quiz", JOptionPane.QUESTION_MESSAGE);
        String inputAnswer = JOptionPane.showInputDialog(null);
        return inputAnswer;
    }

    public static Object displayMultChoice (MultChoice multChoice) {

        ImageIcon icon = new ImageIcon("null");
        String question = multChoice.getQuestion();
        Object message = multChoice.getQuestion();
        Object[] choices = {multChoice.getChoiceA(), multChoice.getChoiceB(), multChoice.getChoiceC()};
        Object inputAnswer = JOptionPane.showInputDialog(
                frame,
                message,
                "Dumb Quiz",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                choices,
                choices[0]);
        return inputAnswer;
    }

    public static String displayMathProblem(MathProblem mathProblem) {

        JOptionPane.showMessageDialog(frame, mathProblem.getQuestion() + " " + mathProblem.getEquation(), "Dumb Quiz", JOptionPane.QUESTION_MESSAGE);
        String inputAnswer = JOptionPane.showInputDialog(null);
        return inputAnswer;
    }

    public static void checkAnswer(String answer, String inputAnswer) {
        if (answer.equals(inputAnswer)) {
            JOptionPane.showMessageDialog(frame, "You're right! :)", "Dumb Quiz", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "You're wrong! :(", "Dumb Quiz", JOptionPane.ERROR_MESSAGE);}
    }

    public static void checkMultAnswer(MultChoice multChoice, Object inputAnswer) {

        if (multChoice.getAnswer().equals(inputAnswer.toString()) || multChoice.getAltAnswer().equals(inputAnswer) || multChoice.getAltAnswer2().equals(inputAnswer)) {
            JOptionPane.showMessageDialog(frame, "You're right! :)", "Dumb Quiz", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "You're wrong! :(", "Dumb Quiz", JOptionPane.ERROR_MESSAGE);
        }
    }
}
