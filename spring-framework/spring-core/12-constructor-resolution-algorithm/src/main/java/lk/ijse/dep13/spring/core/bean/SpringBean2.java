package lk.ijse.dep13.spring.core.bean;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class SpringBean2 {

//    public SpringBean2() {
//        System.out.println("Spring Bean2()");
//    }

    public SpringBean2(int a) {
        System.out.println("Spring Bean2(int)");
    }

    public SpringBean2(String a, int b) {
        System.out.println("Spring Bean2(String, int)");
    }
}
