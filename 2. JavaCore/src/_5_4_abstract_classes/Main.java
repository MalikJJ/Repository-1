package _5_4_abstract_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ERPSystem erpSystem1 = new ERPSystem();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    -----------------------------------
                    PRESS [1] TO ADD USER
                    PRESS [2] TO LIST USERS
                    PRESS [3] TO LIST USER BY INDEX
                    
                    PRESS [0] TO EXIT                    
                    """);
            int mainCommand = in.nextInt();
            if (mainCommand == 1) {
                erpSystem1.addUser();
            } else if (mainCommand == 2) {
                erpSystem1.printAllUsers();
            } else if (mainCommand == 3) {
                erpSystem1.printUser();
            } else if (mainCommand == 0) {
                break;
            }
        }
    }
}

//------------------------------------------------------------------

