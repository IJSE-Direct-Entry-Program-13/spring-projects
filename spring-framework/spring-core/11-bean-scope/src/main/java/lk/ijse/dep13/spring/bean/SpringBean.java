package lk.ijse.dep13.spring.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
//@Scope("prototype")
@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public void init(){
        System.out.println("SpringBean init()");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SpringBean destroy()");
    }
}
