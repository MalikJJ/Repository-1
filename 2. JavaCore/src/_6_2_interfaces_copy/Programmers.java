package _6_2_interfaces_copy;

public class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }
    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary =bonusSalary;
        this.KPIValue = KPIValue;
    }
    public Programmers(Programmers programmer) {
        this.copy(programmer);
    }

//    @Override
//    public String toString() {
//        return "Programmer" +
//                ", id " + id +
//                ", nickname - " + nickname +
//                ", salary " + salary +
//                ", bonus salary " + bonusSalary +
//                ", KPI value " + KPIValue +
//                ", total salary " + getSalary();
//    }

    @Override
    public String getWorkerData() {
        return toString();
    }

    @Override
    public int getSalary() {
        double programmersSalary = salary + KPIValue * bonusSalary;
        return (int)programmersSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    public void copy(Programmers programmer) {
        this.setId(programmer.getId());
        this.setNickname(programmer.getNickname());
        this.setSalary(programmer.getSalary());
        this.setBonusSalary(programmer.getBonusSalary());
        this.setKPIValue(programmer.getKPIValue());
    }
}

//-----------------------------------------------------------------------------

