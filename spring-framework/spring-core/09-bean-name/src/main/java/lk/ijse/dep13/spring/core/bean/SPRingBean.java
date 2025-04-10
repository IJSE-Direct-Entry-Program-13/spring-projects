package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class SPRingBean implements BeanNameAware {
    public SPRingBean() {
        System.out.println("SPRingBean()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: " + name);
    }
}
