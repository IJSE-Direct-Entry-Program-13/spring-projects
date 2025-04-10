package lk.ijse.dep13.spring.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringBean4 {

    @Autowired
    public SpringBean1 springBean1;

    public SpringBean4() {
        System.out.println("SpringBean4()");
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct");
        System.out.println(springBean1);
    }
}
