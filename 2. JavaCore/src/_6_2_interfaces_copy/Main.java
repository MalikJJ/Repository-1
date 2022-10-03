package _6_2_interfaces_copy;

public class Main {
    public static void main(String[] args) {
        _6_2_interfaces_copy.Staff staff1 = new _6_2_interfaces_copy.Staff(1, "Almas", "Akhmetuly", 500000);
        _6_2_interfaces_copy.Staff staff2 = new _6_2_interfaces_copy.Staff(2, "Bekaidar", "Baikuatuly", 350000);
        _6_2_interfaces_copy.Staff staff3 = new _6_2_interfaces_copy.Staff(3, "Vali", "Validuly", 470000);
        _6_2_interfaces_copy.Staff staff4 = new _6_2_interfaces_copy.Staff(4, "Gani", "Gizatuly", 730000);
        _6_2_interfaces_copy.Staff staff5 = new Staff(5, "Doszhan", "Dastanuly", 870000);

        _6_2_interfaces_copy.HRManagers hrManager1 = new _6_2_interfaces_copy.HRManagers(6, "Erkemai Eldosqyzy", 500000);
        _6_2_interfaces_copy.HRManagers hrManager2 = new _6_2_interfaces_copy.HRManagers(7, "Zhaniya Zhandosqyzy", 510000);
        _6_2_interfaces_copy.HRManagers hrManager3 = new _6_2_interfaces_copy.HRManagers(8, "Zarifa Zeinqyzy", 730000);
        _6_2_interfaces_copy.HRManagers hrManager4 = new _6_2_interfaces_copy.HRManagers(9, "Indira Iliyasqyzy", 1150000);
        _6_2_interfaces_copy.HRManagers hrManager5 = new HRManagers(10, "Kamila Kaisarqyzy", 1270000);

        _6_2_interfaces_copy.Programmers programmerIntern1 = new _6_2_interfaces_copy.Programmers(11, "novice programmer Mazhit", 150000, 50000, 1);
        _6_2_interfaces_copy.Programmers programmerIntern2 = new _6_2_interfaces_copy.Programmers(12, "novice programmer Noyan", 150000, 50000, 1);
        _6_2_interfaces_copy.Programmers programmerJunior = new _6_2_interfaces_copy.Programmers(13, "programmer Orken", 200000, 100000, 1);
        _6_2_interfaces_copy.Programmers programmerMiddle = new _6_2_interfaces_copy.Programmers(14, "savvy programmer Raiym", 450000, 200000, 0.5);
        _6_2_interfaces_copy.Programmers programmerSenior = new _6_2_interfaces_copy.Programmers(15, "experienced programmer Sapar", 750000, 500000, 1);

        Workers[] workers = {staff1, staff2, staff3, staff4, staff5,
                hrManager1, hrManager2, hrManager3, hrManager4, hrManager5,
                programmerIntern1, programmerIntern2,
                programmerJunior,
                programmerMiddle,
                programmerSenior};

        int maxSalary = Integer.MIN_VALUE;
        int indexOfMaxSalary = - 1;

//        for (int i = 0; i < workers.length; i++) {
//            if (workers[i].getSalary() > maxSalary) {
//                maxSalary = workers[i].getSalary();
//                indexOfMaxSalary = i;
//            }
//        }
//        System.out.println("The worker with the highest salary is " +
//                workers[indexOfMaxSalary].getWorkerData() + "\n");

///////////////////////////////////////////////////////////////////
//
//        Workers[] workerListInDescendingOrderOfSalary = new Workers[workers.length];
//        for (int i = 0; i < workerListInDescendingOrderOfSalary.length; i++) {
//            workerListInDescendingOrderOfSalary[i] = workers[i];
//        }
//
//        for (int i = 0; i < workers.length; i++) {
//            maxSalary = workers[i].getSalary();
//            indexOfMaxSalary = i;
//            for (int j = i + 1; j < workers.length; j++) {
//                if (workers[j].getSalary() > maxSalary) {
//                    maxSalary = workers[j].getSalary();
//                    indexOfMaxSalary = j;
//                }
//            }
//            if (indexOfMaxSalary != i) {
//                Workers temp = workerListInDescendingOrderOfSalary[i];
//                workerListInDescendingOrderOfSalary[i] = workers[indexOfMaxSalary];
//                workerListInDescendingOrderOfSalary[indexOfMaxSalary] = temp;
//            }
//        }
//
//        for (int i = 0; i < workerListInDescendingOrderOfSalary.length; i++) {
//            System.out.println((i + 1) + ") " + workerListInDescendingOrderOfSalary[i].getWorkerData());
//        }
//
//        System.out.println();
//
///////////////////////////////////////////////////////////////////

        _6_2_interfaces_copy.Programmers[] programmersList = {programmerIntern1, programmerIntern2,
                programmerJunior,
                programmerMiddle,
                programmerSenior};

        _6_2_interfaces_copy.Programmers[] programmersList2 = new _6_2_interfaces_copy.Programmers[programmersList.length];

        for (int i = 0; i < programmersList2.length; i++) {
            programmersList2[i] = new Programmers(programmersList[i]);
            System.out.println(programmersList[i]);
            System.out.println(programmersList2[i]);
            System.out.println();
        }



//        for (int i = 0; i < workers.length; i++) {
//            System.out.println((i + 1) + ") " + workers[i].getWorkerData());
//        }
    }
}

//------------------------------------------------------------------------------------

