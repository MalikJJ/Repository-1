package _4_6_inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] listOfUsers = new User[100];
        int i = 0;
        while (true) {
            System.out.println("""
                    ------------------------------                                    
                    PRESS [1] TO ADD USER
                    PRESS [2] TO LIST USERS
                                    
                    PRESS [0] TO EXIT
                    """);
            int mainCommand = in.nextInt();
            if (mainCommand == 1) {
                System.out.println("""
                        ------------------------------                        
                        \t PRESS [1] TO ADD STUDENT
                        \t PRESS [2] TO ADD STAFF
                                        
                        PRESS [0] TO EXIT
                        """);
                int subCommand = in.nextInt();
                if (subCommand == 1) {
                    System.out.println("Enter student name: (step 1 of 3)");
                    String name = in.next();
                    System.out.println("Enter student surname: (step 2 of 3)");
                    String surname = in.next();
                    System.out.println("Enter GPA: (step 3 of 3)");
                    double gpa = in.nextDouble();
                    Student student = new Student(name, surname, gpa);
                    listOfUsers[i] = student;
                    i++;
                    System.out.println("""
                            ------------------------------
                            Student added to the list""");
                } else if (subCommand == 2) {
                    System.out.println("Enter staff name: (step 1 of 3)");
                    String name = in.next();
                    System.out.println("Enter staff surname: (step 2 of 3)");
                    String surname = in.next();
                    System.out.println("Enter salary: (step 3 of 3)");
                    double salary = in.nextDouble();
                    Staff staff = new Staff(name, surname, salary);
                    listOfUsers[i] = staff;
                    i++;
                    System.out.println("""
                            ------------------------------
                            Staff added to the list""");
                } else if (subCommand == 0) break;
            } else if (mainCommand == 2) {
                if (i == 0) {
                    System.out.println("""
                        ------------------------------                                                
                        The list is empty, please add students and/or staff first""");
                    }
                else {
                    System.out.println("""
                        ------------------------------
                        \t PRESS [1] TO LIST STUDENTS
                        \t PRESS [2] TO LIST STAFF
                                        
                        PRESS [0] TO EXIT
                        """);
                    int subCommand = in.nextInt();
                    if (subCommand == 1) {
                        int listCount = 1;
                        for (int j = 0; j < listOfUsers.length; j++) {
                            if (listOfUsers[j] instanceof Student) {
                                System.out.print((listCount) + ") ");
                                listOfUsers[j].getData();
                                listCount++;
                            }
                        }
                    } else if (subCommand == 2) {
                        int listCount = 1;
                        for (int k = 0; k < listOfUsers.length; k++) {
                            if (listOfUsers[k] instanceof Staff) {
                                System.out.print((listCount) + ") ");
                                listOfUsers[k].getData();
                                listCount++;
                            }
                        }
                    } else if (subCommand == 0) break;
                }
            } else if (mainCommand == 0) break;
        }
    }
}

//------------------------------------------------------------------

