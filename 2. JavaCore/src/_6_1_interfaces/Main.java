package _6_1_interfaces;

public class Main {
    public static void main(String[] args) {
        Users user1 = new Users("Almas", "Akhmetuly");
        Users user2 = new Users("Berik", "Bolatuly");
        Users user3 = new Users("Vali", "Validuly");
        Users user4 = new Users("Gani", "Galymuly");
        Users user5 = new Users("Damir", "Daurenuly");
        Users user6 = new Users("Yermek", "Erzhanuly");
        Users user7 = new Users("Zandos", "Zhigeruly");
        Users user8 = new Users("Zein", "Zamiruly");
        Users user9 = new Users("Iliyas", "Ildaruly");
        Users user10 = new Users("Kaiyrzhan", "Kadiruly");
        Users user11 = new Users("John", "Jacobs");
        Users user12 = new Users("John", "Smith");
        Users user13 = new Users("John", "Smith");
        Users user14 = new Users("Sam", "Smith");
        Users user15 = new Users("Adam", "Smith");

        Users[] list = {user1, user2, user3, user4, user5,
                user6, user7, user8, user9, user10,
                user11, user12, user13, user14, user15};

        UserBeanlmp userBeanlmp = new UserBeanlmp(list);

        userBeanlmp.getAllUsers();

        userBeanlmp.getUsersByName("John");

        userBeanlmp.getUsersBySurame("Smith");

        System.out.println(userBeanlmp);
    }
}

//-------------------------------------------------------------

