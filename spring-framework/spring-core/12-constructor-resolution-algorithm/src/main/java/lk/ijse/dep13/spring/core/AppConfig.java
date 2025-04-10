package lk.ijse.dep13.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String str(){
        return "ijse";
    }

    @Bean
    public Integer myInt(){
        return 10;
    }

    @Bean
    public BigDecimal myDecimal(){
        return new BigDecimal("30");
    }
}
