package task1.dbmanager;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class DBManagerTasks {

    private static ArrayList<Tasks> allTasks=new ArrayList<>();
    private static Long id=5l;

    static{
        allTasks.add(new Tasks(1l,"Создать Веб приложение по Java EE","Done",new Date()));
        allTasks.add(new Tasks(2l,"Встать рано утром и посетить тренинг","Will Do",new Date()));
        allTasks.add(new Tasks(3l,"Создать приложение по Web по Спрингу","",new Date()));
        allTasks.add(new Tasks(4l,"Закончить Java EE и Frontend полностью","Will Do",new Date()));
    }

    public static void addTasks(Tasks task){
        task.setId(id);
        id++;
        allTasks.add(task);
    }

    public static ArrayList<Tasks> getAllTasks(){
        return allTasks;
    }

    public static void deleteTask(int id){
        for (int i = 0; i < allTasks.size(); i++) {
            if (allTasks.get(i).getId() == id){
                allTasks.remove(allTasks.get(i));
            }
        }
    }

    public static Tasks getTask(int id){
        Tasks task = new Tasks();
        for (int i = 0; i < allTasks.size(); i++) {
            if (allTasks.get(i).getId() == id){
                task=allTasks.get(i);
                System.out.println(task.getId()+"   "+ task.getName());
            }
        }
        return task;
    }




}
