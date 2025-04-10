package lk.ijse.dep13.spring.core.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MySpringBean {
    public MySpringBean() {
        System.out.println("MySpringBean()");
    }
}
