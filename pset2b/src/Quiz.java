import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 * Created by jameskane on 5/7/15.
 */

public class Quiz {

    private static Component frame;

    public static void main (String[] args) {

        // track correct answers
        int rightAnswers = 0;

        // instantiate three  question/answer pairs
        Question question1 = new Question("What is (fictional) real name of Iron Man?", "Tony Stark");
        MultChoice question2 = new MultChoice("Blue", "Red", "Yellow");
        MathProblem question3 = new MathProblem("x + 2 / 5 = 1");

        JOptionPane.showMessageDialog(frame, question1.getQuestion(), "Quiz - Question #1", JOptionPane.PLAIN_MESSAGE);
        String inputAnswer = JOptionPane.showInputDialog(null);

        System.out.println(inputAnswer);
        System.out.println(question1.getAnswer());

        rightAnswers += checkAnswer(question1, inputAnswer);

        JOptionPane.showMessageDialog(frame, question1.getQuestion(), "Quiz - Question #1", JOptionPane.PLAIN_MESSAGE);


        System.out.println("Right answers: " + rightAnswers);
    }

    public static int checkAnswer(Question question, String inputAnswer) {
        if (question.getAnswer() == inputAnswer) return 1;
        else return 0;
    }

}
