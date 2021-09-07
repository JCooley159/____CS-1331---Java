public class Course {

    private String courseName; // = args[0];
    private int credits; //= Integer.parseInt(args[1]);
    private int letterGrade; //= Integer.parseInt(args[2]);

    public Course(String courseName, int credits, int letterGrade) {
        this.courseName= courseName;
        this.credits = credits;
        this.letterGrade = letterGrade;
    }

    public int getCredits() {
        return credits;
    }

    public int getGrade() {
        return letterGrade;
    }

    public String toString() {
        return courseName + ": " + letterGrade;
    }
}
