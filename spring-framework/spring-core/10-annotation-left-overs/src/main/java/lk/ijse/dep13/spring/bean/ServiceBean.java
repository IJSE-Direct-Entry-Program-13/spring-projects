package lk.ijse.dep13.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class ServiceBean {

    public ServiceBean() {
        System.out.println("ServiceBean()");
    }
}
