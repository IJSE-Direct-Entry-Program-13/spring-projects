package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SpringBean {

    // Basic Injections
    public SpringBean(@Value("10") int x,
                      @Value("ijse") String a,
                      @Value("true") boolean flag,
                      @Value("kasun, nuwan, ruwan") String[] names,
                      @Value("10,20,30,40") int[] nums) {
        System.out.println("SpringBean()");
        System.out.println("x= " + x);
        System.out.println("a= " + a);
        System.out.println("flag= " + flag);
        System.out.println("names= " + Arrays.toString(names));
        System.out.println("nums= " + Arrays.toString(nums));
    }

//    @Autowired
//    public void setX() {
//        System.out.println("x= ");
//    }
}
