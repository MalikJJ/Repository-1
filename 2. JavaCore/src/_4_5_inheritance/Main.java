package _4_5_inheritance;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "User1", "qwerty1", "Almas", "Armanuly");
        User user2 = new User(2, "User2", "qwerty2", "Berik", "Bakhytuly");
        User user3 = new User(3, "User3", "qwerty3", "Gani", "Galymuly");
        User user4 = new User(4, "User4", "qwerty4", "Dastan", "Dosymyly");
        User user5 = new User(5, "User5", "qwerty5", "Ernazar", "Elzhanuly");

        Staff staff1 = new Staff(6, "User6", "qwerty6", "Zhanibek", "Zharykuly", 450000);
        Staff staff2 = new Staff(7, "User7", "qwerty7", "Zaman", "Iliyasuly", 550000);
        Staff staff3 = new Staff(8, "User8", "qwerty8", "Kaisar", "Kadyruly", 350000);
        Staff staff4 = new Staff(9, "User9", "qwerty9", "Madi", "Mansuruly", 530000);
        Staff staff5 = new Staff(10, "User10", "qwerty10", "Oraz", "Ordabekuly", 570000);

        Student student1 = new Student(11, "User11", "qwerty11", "Raiymbek", "Rauanuly", 4);
        Student student2 = new Student(12, "User12", "qwerty12", "Medet", "Maratuly", 4.5);
        Student student3 = new Student(13, "User13", "qwerty13", "Kasym", "Kaisaruly", 4.7);
        Student student4 = new Student(14, "User14", "qwerty14", "Zharas", "Zhambyluly", 4.3);
        Student student5 = new Student(15, "User15", "qwerty15", "Darmen", "Daniyaruly", 4.9);

        User[] listOfUsers = {user1, user2,user3, user4, user5,
                staff1, staff2, staff3, staff4, staff5,
                student1, student2, student3, student4, student5};

        staff1.addSubject("Math");
        staff1.addSubject("Physics");

        staff2.addSubject("Archery");
        staff2.addSubject("Swimming");

        staff3.addSubject("Art");
        staff3.addSubject("Drawing");

        staff4.addSubject("Accounting");
        staff4.addSubject("Audit");

        staff5.addSubject("Engineering");
        staff5.addSubject("Construction");

        student1.addCourse("Computer science");
        student1.addCourse("Information technology");

        student2.addCourse("Japan language");
        student2.addCourse("Law");

        student3.addCourse("Calculus");
        student3.addCourse("Linear algebra");

        student4.addCourse("Statistics");
        student4.addCourse("Biology");

        student5.addCourse("Mechanics");
        student5.addCourse("Psychology");

        for (int i = 0; i < listOfUsers.length; i++) {
            System.out.println(listOfUsers[i].getData());
        }
    }
}

//------------------------------------------------------------------

