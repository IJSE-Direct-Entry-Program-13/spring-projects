package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware {
    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: " + name);
    }
}
