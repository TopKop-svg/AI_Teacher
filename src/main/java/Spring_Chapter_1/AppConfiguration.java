package Spring_Chapter_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public AppConfiguration() {
    }

    @Bean
    public Animal animal() {
        return new Dog();
    }
}
