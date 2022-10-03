package _4_5_inheritance;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public String filledCourses() {
        String filledCourses = "";
        for (int i = 0; i < indexOfCourses; i++) {
            filledCourses = filledCourses +
                    "\t\t" + (i + 1) + ") " +
                    courses[i] + "\n";
        }
        return filledCourses;
    }

    @Override
    public String toString() {
        return "Student, " + super.toString() +
                ", gpa " + gpa +
                "\n\t choosen courses:" +
                "\n" + filledCourses();
    }

    public String getData() {
        return toString();
    }
}

//------------------------------------------------------------------

