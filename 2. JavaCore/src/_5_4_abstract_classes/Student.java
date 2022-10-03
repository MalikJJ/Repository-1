package _5_4_abstract_classes;

public class Student extends User {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student() {
    }
    public Student(String login, String password, String name, String surname, String group, double gpa) {
        super(login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student, " + super.toString() +
                ", name " + name +
                ", surname " + surname +
                ", group " + group +
                ", gpa " + gpa;
    }

    @Override
    public String getUserData() {
        return toString();
    }
}

//------------------------------------------------------------------

