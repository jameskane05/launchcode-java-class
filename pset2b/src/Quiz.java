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

        // instantiate the first question/answer pair
        Question question1 = new Question("What is (fictional) real name of Iron Man?", "Tony Stark");

        JOptionPane.showMessageDialog(frame, question1.getQuestion(), "Quiz - Question #1", JOptionPane.PLAIN_MESSAGE);
        String inputAnswer = JOptionPane.showInputDialog(null);

        assertEquals(question1.getAnswer(), inputAnswer);
    }
}
