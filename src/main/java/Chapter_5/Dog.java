package Chapter_5;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        if (!breed.trim().isEmpty() && breed != null) {
            this.breed = breed;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.trim().isEmpty() && breed != null) {
            this.breed = breed;
        } else {
            throw new IllegalArgumentException("Введите корректные данные!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\'' +
                ", breed=" + breed +

        '}';
    }
}
