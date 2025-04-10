package lk.ijse.dep13.spring.core.bean;

import org.springframework.beans.factory.BeanNameAware;

public class DepBean implements BeanNameAware {
    public DepBean() {
        System.out.println("DepBean()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: " + name);
    }
}
