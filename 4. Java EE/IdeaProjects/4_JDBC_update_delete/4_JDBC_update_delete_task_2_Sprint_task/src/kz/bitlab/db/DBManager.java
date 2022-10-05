package kz.bitlab.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/bootcamp_db_2ee", "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Items> getItems() {

        ArrayList<Items> itemList = new ArrayList<>();

        try {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM t_items");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Items item = new Items();

                item.setId(resultSet.getInt("id"));
                item.setName(resultSet.getString("name"));
                item.setModel(resultSet.getString("model"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));

                itemList.add(item);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return itemList;
    }

    public static Users getUser(String email) {
        Users user = null;
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_users WHERE email = ?");
            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                user = new Users();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setFulName(resultSet.getString("full_name"));
                user.setPassword(resultSet.getString("password"));
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
