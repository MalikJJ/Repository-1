package _4_6_inheritance;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indOfSubject = 0;

    private int id = 0;

    private static int count = 1;

    public Staff() {
    }
    public Staff(String name, String surname, double salary) {
        id = count;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        count++;
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indOfSubject] = subject;
        indOfSubject++;
    }

    public void printFilledSubjects() {
        for (int i = 0; i < indOfSubject; i++) {
            System.out.println("\t\t" + (i + 1) + ") " + subjects[i]);
        }
    }

    @Override
    public String toString() {
        return "Staff, id " + id + ", " + super.toString() + ", salary " + salary;
    }

    public void getData() {
        System.out.println(toString());
    }
}

//------------------------------------------------------------------

