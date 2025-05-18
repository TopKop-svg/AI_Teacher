package Perplexity.Chapter_1.Task1;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
public class Person {
    @Setter
    private String name;
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Введите корректный возраст");
        } else {
            this.age = age;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return person.name.equals(this.name) && person.age == this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) * age;
    }
}
