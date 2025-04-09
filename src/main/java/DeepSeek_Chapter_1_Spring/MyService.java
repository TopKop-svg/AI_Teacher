package DeepSeek_Chapter_1_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final Repository repository;

    @Autowired
    public MyService(Repository repository) {
        this.repository = repository;
    }

    public String fetchData() {
        return repository.getData();
    }
}
