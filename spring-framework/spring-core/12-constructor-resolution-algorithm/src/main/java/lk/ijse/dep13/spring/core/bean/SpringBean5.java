package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean5 {

    public SpringBean5() {
        System.out.println("Spring Bean5()");
    }

    @Autowired(required = false)
    public SpringBean5(int a, String b){
        System.out.println("Spring Bean5(int, String)");
    }

    @Autowired(required = false)
    public SpringBean5(String a, int b){
        System.out.println("Spring Bean5(String, int)");
    }
}
