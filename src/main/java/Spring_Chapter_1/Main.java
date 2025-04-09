package Spring_Chapter_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Spring_Chapter_1");
        PetOwner pet = context.getBean(Cat.class);

    }
}
