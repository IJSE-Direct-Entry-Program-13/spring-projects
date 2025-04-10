package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean3 {

    public SpringBean3() {
        System.out.println("Spring Bean3()");
    }

    @Autowired
    public SpringBean3(int a){
        System.out.println("Spring Bean3(int)");
    }

    public SpringBean3(String a, int b){
        System.out.println("Spring Bean3(String, int)");
    }
}
