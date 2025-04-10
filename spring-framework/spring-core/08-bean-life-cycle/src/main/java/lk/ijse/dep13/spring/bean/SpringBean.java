package lk.ijse.dep13.spring.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton")
@Scope("prototype")
@Component
public class SpringBean implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware");
    }


    public SpringBean() {
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct()");
    }

    @PreDestroy
    public void close(){
        System.out.println("PreDestroy()");
    }
}
