package _6_2_interfaces_copy;

public class HRManagers implements Workers {
    private int id;
    private String fullName;
    private int salary;

    public HRManagers() {
    }
    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "HR manager" +
                ", id " + id +
                ", full name " + fullName +
                ", salary " +  salary;
    }

    @Override
    public String getWorkerData() {
        return toString();
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void copy(HRManagers hrManager) {
        this.setId(hrManager.getId());
        this.setFullName(hrManager.getFullName());
        this.setSalary(hrManager.getSalary());
    }
}

//-------------------------------------------------------------------

