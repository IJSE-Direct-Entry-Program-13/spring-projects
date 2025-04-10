package lk.ijse.dep13.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl1 implements MyService{

    public MyServiceImpl1() {
        System.out.println("MyServiceImpl1()");
    }
}
