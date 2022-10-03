package _4_6_inheritance;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    private int id = 0;

    private static int count = 0;


    public Student() {
    }
    public Student(String name, String surname, double gpa) {
        count++;
        id = count;
        super.name = name;
        super.surname = surname;
        this.gpa = gpa;
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

    public static int getCount() {
        return count;
    }

    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void printFilledCourses() {
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println("\t\t" + (i + 1) + ") " + courses[i]);
        }
    }

    @Override
    public String toString() {
        return "Student, id " + id + ", " + super.toString() + ", gpa " + gpa;
    }

    public void getData() {
        System.out.println(toString());
    }
}

//------------------------------------------------------------------

