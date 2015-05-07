/**
 * Created by jameskane on 5/5/15.
 */
public class Course {
    private String name;
    private int credits;
    private int seats;
    private Student[] roster;

    public Course(String name, int credits, int seats, Student[] roster) {
        this.name = name;
        this.credits = credits;
        this.seats = seats;
        this.roster = roster;
    }

    public String getCourseName() {
        return this.name;
    }  //tested

    public int getCourseCredits() {
        return this.credits;
    }  //tested

    public int getCourseSeats() {
        return this.seats;
    }  //tested

    public Student[] getCourseRoster() {
        return this.roster;
    }  //tested

    public String toString() {
        return this.name + " - " + this.credits + " credits";
    }  //tested

    //tested
    public boolean addStudent(Student student) {
        int seats = getCourseSeats();
        Student[] roster = getCourseRoster();

        for (int i = 0; i < seats; i++) {
            if (roster[i] == null) {
                roster[i] = student;
                return true;
            }
            else if (roster[i] == student) {
                return false;
            }
        }
        return false;
    }

    //tested
    public Student[] printRoster() {
        return getCourseRoster();
    }

    public double averageGPA() {
        // initializing necessary variables
        double[] allGPAs = new double[25];
        double totalGPA = 0;
        double avgGPA = 0.0;
        int seatsFilled = 0;
        Student[] roster = getCourseRoster();
        int rosterLen = roster.length;

        // iterating over the roster looking for students' names
        for (int n = 0; roster[n] != null; n++) {
                seatsFilled++;
                allGPAs[n] = roster[n].getGPA();
        }

        for (int x = 0; x < seatsFilled; x++)
            totalGPA += allGPAs[x];

        avgGPA = totalGPA / seatsFilled;

        return avgGPA;
    }
}
