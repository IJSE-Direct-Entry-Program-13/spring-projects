package lk.ijse.dep13.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl2 implements MyService{

    public MyServiceImpl2() {
        System.out.println("MyServiceImpl2()");
    }
}
