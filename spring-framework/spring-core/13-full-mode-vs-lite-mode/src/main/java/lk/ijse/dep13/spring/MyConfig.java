package lk.ijse.dep13.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public String str(){
        System.out.println("str()");
        return "ijse";
    }
}
