package lk.ijse.dep13.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class B {

    public B() {
        System.out.println("B()");
    }
}
