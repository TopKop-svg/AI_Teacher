package DeepSeek_Chapter_1_Spring;

import org.springframework.stereotype.Component;

@Component
public class MyRepository implements Repository {

    @Override
    public String getData() {
        return "Data from DB";
    }
}
