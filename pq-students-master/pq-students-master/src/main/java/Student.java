public class Student {

    private String stuName;
    private Course[] courses;

    public Student(String stuName, Course ... courses) {
        this.stuName = stuName;
        this.courses = courses;
    }

    public int getCredits() {
        int credTotal = 0;
        for(int i = 0; i < courses.length - 1; i++) {
            credTotal = credTotal + courses[i].getCredits();
        }
        return credTotal;
    }

    public String toString() {
        int numCourses = courses.length;
        System.out.printf("%s is taking %d courses:\n", stuName, numCourses);
        for (int j = 0; j < courses.length - 1; j++) {
            System.out.println(courses[j].toString());
        }
        return null;
    }

    public double getGPA() {
        return 0.0;
    }

}
