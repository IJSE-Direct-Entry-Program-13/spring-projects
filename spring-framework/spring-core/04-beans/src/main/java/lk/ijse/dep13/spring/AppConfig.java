package lk.ijse.dep13.spring;

import lk.ijse.dep13.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    //@Bean
    public SpringBean springBean() {
        return new SpringBean();
    }

}
