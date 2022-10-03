package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Tasks> taskList = new ArrayList<>();

    public static int id = 6;

    static {
        Tasks task1 = new Tasks();
        task1.setId(1);
        task1.setName("Создать Веб-приложение на Java EE");
        task1.setDescription("Да");
        task1.setDeadlineDate("23.10.2022");
        task1.setStatus("Да");

        taskList.add(task1);

        Tasks task2 = new Tasks();
        task2.setId(2);
        task2.setName("Убраться дома и закупить продукты");
        task2.setDescription("Да");
        task2.setDeadlineDate("25.10.2022");
        task2.setStatus("Да");

        taskList.add(task2);

        Tasks task3 = new Tasks();
        task3.setId(3);
        task3.setName("Выполнить все домашние задания");
        task3.setDescription("Нет");
        task3.setDeadlineDate("28.10.2022");
        task3.setStatus("Нет");

        taskList.add(task3);

        Tasks task4 = new Tasks();
        task4.setId(4);
        task4.setName("Записаться на тренировку");
        task4.setDescription("Нет");
        task4.setDeadlineDate("01.11.2022");
        task4.setStatus("Нет");

        taskList.add(task4);

        Tasks task5 = new Tasks();
        task5.setId(5);
        task5.setName("Выучить английский до следующего уровня");
        task5.setDescription("Нет");
        task5.setDeadlineDate("01.05.2023");
        task5.setStatus("Нет");

        taskList.add(task5);
    }

    public static ArrayList<Tasks> getTaskList() {
        return taskList;
    }

    public static Tasks getTask(int id) {
        return taskList.stream().filter(tasks -> tasks.getId() == id).findFirst().get();
    }

    public static void addTask(Tasks task) {
        task.setId(id);
        id++;
        taskList.add(task);
    }

    public static void deleteTask(int id) {
        Tasks taskToDelete = taskList.stream().filter(tasks -> tasks.getId() == id).findFirst().get();
        taskList.remove(taskToDelete);
    }
}
