package Spring_Chapter_1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println( "Woof!");
    }
}
