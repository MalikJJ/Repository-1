package _4_5_inheritance;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indOfSubject = 0;

    public Staff() {
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

    public String filledSubjects() {
        String filledSubjects = "";
        for (int i = 0; i < indOfSubject; i++) {
            filledSubjects = filledSubjects +
                    "\t\t" + (i + 1) + ") " +
                    subjects[i] + "\n";
        }
        return filledSubjects;
    }

    @Override
    public String toString() {
        return "Staff, " + super.toString() +
                ", salary " + salary +
                "\n\t subjects taught:" +
                "\n" + filledSubjects();
    }

    public String getData() {
        return toString();
    }
}

//------------------------------------------------------------------

