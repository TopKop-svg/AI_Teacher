package Chapter_7;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private ArrayList<Task> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void completeTask(int index) {
        if (taskList.size() < index) {
            throw new IllegalArgumentException("Задача с таким id не существует");
        } else {
            taskList.get(index).compete();
        }
    }

    public void printTasks() {
        for(Task task: taskList) {
            System.out.println(task.toString());
        }
    }
}
