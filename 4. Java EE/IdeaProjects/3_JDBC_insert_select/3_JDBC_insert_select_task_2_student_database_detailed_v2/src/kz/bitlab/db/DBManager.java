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

    public static ArrayList<Students> getStudents() {

        ArrayList<Students> listOfStudents = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM t_students");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Students student = new Students();

                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setBirthDate(resultSet.getString("birthdate"));
                student.setCity(resultSet.getString("city"));

                listOfStudents.add(student);
            }
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listOfStudents;
    }

    public static void addStudent(Students student) {

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO t_students (name, surname, birthdate, city) " +
                    "VALUES (?, ?, ?, ?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getBirthDate());
            statement.setString(4, student.getCity());

            statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Students getStudent(int id) {
        Students student = null;

        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT * FROM t_students WHERE id = ?");
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                student = new Students();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setBirthDate(resultSet.getString("birthdate"));
                student.setCity(resultSet.getString("city"));

            }

            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}
