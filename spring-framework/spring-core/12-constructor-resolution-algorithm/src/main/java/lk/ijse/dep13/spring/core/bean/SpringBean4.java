package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class SpringBean4 {

    @Autowired(required = false)
    public SpringBean4() {
        System.out.println("1.Spring Bean4()");
    }

    @Autowired(required = false)
    public SpringBean4(int a){
        System.out.println("2.Spring Bean4(int)");
    }

    @Autowired(required = false)
    public SpringBean4(int a, String b, BigDecimal c){
        System.out.println("3.Spring Bean4(int, String, BigDecimal)");
    }

    @Autowired(required = false)
    public SpringBean4(String a, int b){
        System.out.println("4.Spring Bean4(String, int)");
    }

    @Autowired(required = false)
    public SpringBean4(String a, int b, BigDecimal c, String d){
        System.out.println("5.Spring Bean4(String, int, BigDecimal, String)");
    }

    @Autowired(required = false)
    public SpringBean4(String a, int b, BigDecimal c, String d,@Value("false") boolean e){
        System.out.println("6.Spring Bean4(String, int, BigDecimal, String, Boolean)");
    }
}
