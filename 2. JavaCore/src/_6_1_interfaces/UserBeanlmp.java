package _6_1_interfaces;

import java.util.Arrays;

public class UserBeanlmp implements UserBean {
    private Users[] users;

    public UserBeanlmp() {
    }
    public UserBeanlmp(Users[] users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserBeanlmp{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + 1 + ") " + users[i]);
        }
    }

    @Override
    public void getUsersByName(String name) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())) count++;
        }
        System.out.println("\t\tThere are " + count +
                    " users with name " + name + ":");
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())) {
            System.out.println("\t" + (i + 1) + ") " + users[i]);
            }
        }
    }

    @Override
    public void getUsersBySurame(String surname) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (surname.equals(users[i].getSurname())) count++;
        }
        System.out.println("\t\tThere are " + count +
                " users with surname " + surname + ":");
        for (int i = 0; i < users.length; i++) {
            if (surname.equals(users[i].getSurname())) {
                System.out.println("\t" + (i + 1) + ") " + users[i]);
            }
        }
    }
}

//-------------------------------------------------------------

