package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<User> userList = new ArrayList<>();

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void addUser(User user) {
        userList.add(user);
    }
}
