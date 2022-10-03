package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<User> userList = new ArrayList<>();

//    static {
//        userList.add(new User("Ilyas", "Zhuanyshev", "IT", 550000));
//        userList.add(new User("Aybek", "Bagyt", "Management", 650000));
//        userList.add(new User("Alibek", "Serikov", "HR", 350000));
//        userList.add(new User("Serzhan", "Berikov", "IT", 450000));
//        userList.add(new User("Madina", "Assetova", "PR", 350000));
//        userList.add(new User("Anel", "Mukhamejanova", "Management", 400000));
//    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void addUser(User user) {
        userList.add(user);
    }
}
