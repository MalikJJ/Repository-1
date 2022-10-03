package _5_4_abstract_classes;

import java.util.Scanner;

public class ERPSystem {
    private User[] memory = new User[100];
    private int sizeOfUsers = 0;
    Scanner in = new Scanner(System.in);
    public void addUser() {
        System.out.println("""
                \t -----------------------------------
                \t PRESS [1] TO ADD STUDENT
                \t PRESS [2] TO ADD TEACHER
                
                \t PRESS [0] TO EXIT 
                """);
        int subCommand = in.nextInt();
        if (subCommand == 1) {
            System.out.println("\t\t Login:");
            String login = in.next();
            System.out.println("\t\t Password:");
            String password = in.next();
            System.out.println("\t\t Name:");
            String name = in.next();
            System.out.println("\t\t Surname:");
            String surname = in.next();
            System.out.println("\t\t Group:");
            String group = in.next();
            System.out.println("\t\t GPA:");
            double gpa = in.nextDouble();
            System.out.println("\t\t Student successfully added to the list");
            Student student = new Student(login, password, name, surname, group, gpa);
            memory[sizeOfUsers] = student;
            sizeOfUsers++;
        } else if (subCommand == 2) {
            System.out.println("\t\t Login:");
            String login = in.next();
            System.out.println("\t\t Password:");
            String password = in.next();
            System.out.println("\t\t Nickname:");
            String nickname = in.next();
            System.out.println("\t\t Status:");
            String status = in.next();

            Teacher teacher = new Teacher(login,password,nickname,status);
            memory[sizeOfUsers] = teacher;
            sizeOfUsers++;

            System.out.println("\t\t PRESS [1] TO ADD SUBJECT" +
                    "\n\n\t\t PRESS [0] TO FINISH ADDING SUBJECT");
            int addSubjectCommand = in.nextInt();
            while (addSubjectCommand != 1 && addSubjectCommand != 0) {
                System.out.println("\t\t PRESS [1] TO ADD SUBJECT" +
                        "\n\n\t\t PRESS [0] TO FINISH ADDING SUBJECT");
                addSubjectCommand = in.nextInt();
            }
            while (addSubjectCommand == 1) {
                System.out.println("\t\t\t Subject:");
                String subject = in.next();

                teacher.addSubject(subject);

                System.out.println("""
                                \t\t\t The subject successfully added to the teacher's list
                                \n\t\t\t PRESS [1] TO ADD ANOTHER SUBJECT
                                \n\t\t\t PRESS [0] TO FINISH ADDING SUBJECT""");
                addSubjectCommand = in.nextInt();
                while (addSubjectCommand != 1 && addSubjectCommand != 0) {
                    System.out.println("\t\t PRESS [1] TO ADD SUBJECT" +
                            "\n\n\t\t PRESS [0] TO FINISH ADDING SUBJECT");
                    addSubjectCommand = in.nextInt();
                }
                if (addSubjectCommand == 0) break;
            }
        }
    }

    public void printAllUsers() {
        if (sizeOfUsers == 0) System.out.println("Please add users first");
        else {
            System.out.println("""
                    PRESS [1] TO LIST STUDENTS
                                    
                    PRESS [2] TO LIST TEACHERS""");
            int listUsersCommand = in.nextInt();
            if (listUsersCommand == 1) {
                int j = 1;
                for (int i = 0; i < sizeOfUsers; i++) {
                    if (memory[i] instanceof Student) {
                        System.out.println(j + ") " + memory[i]);
                        j++;
                    }
                }
            } else if (listUsersCommand == 2) {
                int j = 1;
                for (int i = 0; i < sizeOfUsers; i++) {
                    if (memory[i] instanceof Teacher) {
                        System.out.println(j + ") " + memory[i]);
                        j++;
                    }
                }
            }
        }
    }
    public void printUser() {
        if (sizeOfUsers == 0) System.out.println("Please add users first");
        else {
            System.out.println("-----------------------------------\n" +
                    "ENTER INDEX (from 0 to " + (sizeOfUsers - 1) + ")");
            int index = in.nextInt();
            System.out.println(memory[index]);
        }
    }
}

//------------------------------------------------------------------

