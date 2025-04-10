package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("abc")
public class SpringBean2 implements BeanNameAware {
    public SpringBean2() {
        System.out.println("SpringBean2()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: " + name);
    }
}
