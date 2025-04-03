package SpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private String helloBean;
    @GetMapping("/hello")
    public String sayHello() {
        return helloBean;
    }
}
