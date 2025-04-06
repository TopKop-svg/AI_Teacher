package Chapter_7;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask("Купить хлэб");
        todoList.addTask("Приготовить завтрак");
        todoList.addTask("Стирка вещей");
        todoList.addTask("Уборка");
        todoList.addTask("Заправить автомобиль");

        todoList.completeTask(3);
        todoList.printTasks();
    }
}
