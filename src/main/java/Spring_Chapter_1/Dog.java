package Spring_Chapter_1;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println( "Woof!");
    }
}
