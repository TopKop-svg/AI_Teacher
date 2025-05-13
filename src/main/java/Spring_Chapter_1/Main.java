package Spring_Chapter_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        //PetOwner pet = context.getBean(PetOwner.class);
        Animal dog = context.getBean(Dog.class);
        //pet.petSound();
        dog.makeSound();
        Animal animal = context.getBean(Cat.class);
        animal.makeSound();

    }
}
