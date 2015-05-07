import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * JUnit tests for Student and Course
 * @author dshook
 *
 */

public class StudentAndCourseTest extends TestCase {
	@Test
	public void testStudentInit() {
		Student s = new Student("Doug", "Shook", 111111);
		assertEquals("Doug Shook", s.getName());
		assertEquals(111111, s.getStudentID());
		//No credits, no GPA
		assertEquals(0.0, s.getGPA());
		assertEquals(0, s.getCredits());

        //Generate some random students, and test
		for (int i = 0; i < 20; ++i) {
			double a =  (Math.random() * 5000);
			double b =  (Math.random() * 5000);
			int c = (int)(Math.random() * 5000);
			Student s3 = new Student("" + a, "" + b, c);
			assertEquals(a + " " + b, s3.getName());
			assertEquals(0.0, s3.getGPA());
			assertEquals(0, s3.getCredits());
		}
	}

    public void testStudents() {
		Student me = new Student("James", "Kane", 222222, 91, 4.0);
		Student you = new Student("Legacy", "Mother", 333333, 80, 3.0);
		System.out.println(me.getName());  //testing getName
		System.out.println(me.toString());  //testing toString
		System.out.println(me.getClassStanding());  //testing getClassStanding
		System.out.println(me.computeTuition());  //testing computeTuition

		Student legacyStudent = me.createLegacy(you);  //testing createLegacy
		System.out.println(legacyStudent.getName());
	}

	public void testCourse() {
		Student[] studentTestArray = new Student[25];
		Course bio = new Course("Biology 101", 4, 25, studentTestArray);  // test Course constructor
		System.out.println(bio.getCourseName());  //test getCourseName
		System.out.println(bio.getCourseCredits());
		System.out.println(bio.getCourseSeats());
		System.out.println(bio.toString());

		// create a new student, attempt to add it to the bio
		Student me = new Student("New", "Guy", 222222, 91, 4.0);
		Student you = new Student("Jay", "Kay", 333333, 90, 3.0);
		boolean studentAdded = bio.addStudent(me);
		boolean studentAdded2 = bio.addStudent(you);
		System.out.println(studentAdded);  // check boolean value resulting from calling bio.addStudent
		System.out.println(studentAdded2);  // check boolean value resulting from calling bio.addStudent

		System.out.println(bio.getCourseSeats());  // check the number of seats after addStudent

		// iterate through course roster, printing each bame
		int rosterLen = bio.getCourseRoster().length;
		for (int n = 0; n < rosterLen; n++) {
			System.out.println(bio.printRoster()[n]);
		}

		double avgGPA = bio.averageGPA();
		System.out.println(avgGPA);
	}
}


