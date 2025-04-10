package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController(@Qualifier("myServiceImpl2") MyService myService) {
        System.out.println("MyController()");
        System.out.printf("myService: " + myService);
    }
}
