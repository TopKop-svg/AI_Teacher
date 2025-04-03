package Chapter_5;

public abstract class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        if (age > 0 && !name.trim().isEmpty() && name != null) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }

    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty() && name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 50) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
