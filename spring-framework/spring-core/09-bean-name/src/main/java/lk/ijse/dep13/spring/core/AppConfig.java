package lk.ijse.dep13.spring.core;

import lk.ijse.dep13.spring.core.bean.DepBean;
import lk.ijse.dep13.spring.core.bean.SpringBean;
import lk.ijse.dep13.spring.core.bean.SpringBean2;
import lk.ijse.dep13.spring.core.bean.TestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public DepBean depBean(SpringBean springBean, @Value("abc") String str) {
        return new DepBean();
    }

    @Bean
    public DepBean DepBean(@Value("10") int x) {
        return new DepBean();
    }

    @Bean("something")
    public DepBean depBean2() {
        return new DepBean();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public TestBean testBean(){
        return new TestBean();
    }
}
