package Chapter_7;

public class Task {
    private String description;
    private boolean isCompleted;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.trim().isEmpty() && description != null) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    public void compete() {
        isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Task(String description) {
        if (!description.trim().isEmpty() && description != null) {
            this.description = description;
            this.isCompleted = false;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    @Override
    public String toString() {
        return "Task: " +
                "[" + description + "]" +
                " Completed: [" + isCompleted +
                "]";
    }
}
