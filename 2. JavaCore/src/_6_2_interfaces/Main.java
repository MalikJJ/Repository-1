package _6_2_interfaces;

public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff(1, "Almas", "Akhmetuly", 500000);
        Staff staff2 = new Staff(2, "Bekaidar", "Baikuatuly", 350000);
        Staff staff3 = new Staff(3, "Vali", "Validuly", 470000);
        Staff staff4 = new Staff(4, "Gani", "Gizatuly", 730000);
        Staff staff5 = new Staff(5, "Doszhan", "Dastanuly", 870000);

        HRManagers hrManager1 = new HRManagers(6, "Erkemai Eldosqyzy", 500000);
        HRManagers hrManager2 = new HRManagers(7, "Zhaniya Zhandosqyzy", 510000);
        HRManagers hrManager3 = new HRManagers(8, "Zarifa Zeinqyzy", 730000);
        HRManagers hrManager4 = new HRManagers(9, "Indira Iliyasqyzy", 1150000);
        HRManagers hrManager5 = new HRManagers(10, "Kamila Kaisarqyzy", 1270000);

        Programmers programmerIntern1 = new Programmers(11, "novice programmer Mazhit", 150000, 50000, 1);
        Programmers programmerIntern2 = new Programmers(12, "novice programmer Noyan", 150000, 50000, 1);
        Programmers programmerJunior = new Programmers(13, "programmer Orken", 200000, 100000, 1);
        Programmers programmerMiddle = new Programmers(14, "savvy programmer Raiym", 450000, 200000, 0.5);
        Programmers programmerSenior = new Programmers(15, "experienced programmer Sapar", 750000, 500000, 1);

        Workers[] workers = {staff1, staff2, staff3, staff4, staff5,
                hrManager1, hrManager2, hrManager3, hrManager4, hrManager5,
                programmerIntern1, programmerIntern2,
                programmerJunior,
                programmerMiddle,
                programmerSenior};

        int maxSalary = Integer.MIN_VALUE;
        int indexOfMaxSalary = - 1;

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > maxSalary) {
                maxSalary = workers[i].getSalary();
                indexOfMaxSalary = i;
            }
        }
        System.out.println("The worker with the highest salary is " +
                workers[indexOfMaxSalary].getWorkerData() + "\n");

        for (int i = 0; i < workers.length; i++) {
            maxSalary = workers[i].getSalary();
            indexOfMaxSalary = -1;
            for (int j = i + 1; j < workers.length; j++) {
                if (workers[j].getSalary() > maxSalary) {
                    maxSalary = workers[j].getSalary();
                    indexOfMaxSalary = j;
                }
            }
            if (indexOfMaxSalary != -1) {
                Workers temp = workers[i];
                workers[i] = workers[indexOfMaxSalary];
                workers[indexOfMaxSalary] = temp;
            }
            System.out.println((i + 1) + ") " + workers[i]);
        }
    }
}

//------------------------------------------------------------------------------------

