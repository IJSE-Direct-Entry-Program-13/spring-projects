package lk.ijse.dep13.spring.core.bean;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class SpringBean {

    public SpringBean(int a, String b, String c, BigDecimal d, boolean f) {
        System.out.println("Spring Bean()");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }
}
