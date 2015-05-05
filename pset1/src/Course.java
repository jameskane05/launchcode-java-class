/**
 * Created by jameskane on 5/5/15.
 */
public class Course {
    private String name;
    private int credits;
    private int seats;
    private String[] roster;

    public Course(String name, int credits, int seats, String[] roster) {
        this.name = name;
        this.credits = credits;
        this.seats = seats;
        this.roster = roster;
    }

    public String getCourseName() { return this.name; }
    public int getCourseCredits() { return this.credits; }
    public int getCourseSeats() { return this.seats; }
    public String[] getCourseRoster() { return this.roster; }

    public String toString() { return this.name + " - " + this.credits + " credits"; }

    public boolean addStudent(Student student) {
        int seats = getCourseSeats();

        if (seats > 0) {
            String[] roster = getCourseRoster();
            String studentName = student.getName();
            roster[roster.length - 1] = studentName;
            this.seats = this.seats - 1;
            return true;
        }

        else return false;
    }

    public String[] printRoster() {
        return getCourseRoster();
    }

    public double averageGPA() {
        String[] roster = getCourseRoster();
        int rosterLen = this.getCourseRoster().length;

        for (int n = 0; n < rosterLen; n++) {
            System.out.println(this.printRoster()[n]);
        }
    }
}
