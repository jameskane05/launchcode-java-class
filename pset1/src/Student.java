import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit Student class/object
 * @author jameskane05
 *
 */

public class Student {
	private String fname;
	private String lname;
	private int id_num;
	private int credits;
	private double gpa;

	public Student(String fname, String lname, int id_num) {
		this.fname = fname;
		this.lname = lname;
		this.id_num = id_num;
	}

	public Student(String fname, String lname, int id_num, int credits, double gpa) {
		this.fname = fname;
		this.lname = lname;
		this.id_num = id_num;
		this.credits = credits;
		this.gpa = gpa;
	}

	public int getStudentID () { return this.id_num; }

	public double getGPA () { return this.gpa; }

	public int getCredits () { return this.credits; }

	public String getName() { return this.fname + " " + this.lname; }

	public String toString() { return this.lname + ", " + this.fname + " - " + this.id_num; }

	public String getClassStanding () {
		int creds = getCredits();
		if (creds < 30) { return "Freshman"; }
		else if (creds >= 30 && creds < 60) { return "Sophomore"; }
		else if (creds >= 60 && creds < 90) { return "Junior"; }
		else { return "Senior"; }
	}

	public int computeTuition () {
		int semTuition = 20000;
		int semCredits = 15;
		int tuitionPerCredit = semTuition / semCredits;
		return this.credits * tuitionPerCredit;
	}

	public Student createLegacy (Student student) {
		int legacyID = (int)(Math.random() * 5000);
		Student legacyStudent = new Student(this.fname + this.lname, student.fname + student.lname, legacyID, this.credits + student.credits, (this.gpa + student.gpa) / 2.0);
		return legacyStudent;
	}

	public void submitGrade(int grade, int courseCredits) {
		int qualScore = grade * courseCredits;
		this.gpa = qualScore / this.credits;
	}
}
