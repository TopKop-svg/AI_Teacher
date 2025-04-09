package DeepSeek_Chapter_1_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("DeepSeek_Chapter_1_Spring");
        MyService service = context.getBean(MyService.class);
        System.out.println(service.fetchData());
    }
}
