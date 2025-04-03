package Chapter_4;


import lombok.Getter;
import lombok.Setter;

public class Student {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int age;
    @Getter
    @Setter
    private double grade;

    public Student(String name, int age, double grade) {
        if (name != null && name != "" && name.length() > 2
           && age > 0 && grade > 0 && grade < 100) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    public void increaseGrade(double amount) {
        if (amount + grade < 100) {
            grade = grade + amount;
        } else {
            throw new IllegalArgumentException("Введите корректные бал!");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
