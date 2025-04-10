package lk.ijse.dep13.spring;

import lk.ijse.dep13.spring.bean.SpringBean2;
import lk.ijse.dep13.spring.bean.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(MyConfig.class)
public class AppConfig {

//    @Bean
//    public SpringBean2 springBean2(SpringBean4 springBean4){
//        SpringBean2 springBean2 = new SpringBean2();
//        System.out.println("Aaawada?");
//        System.out.println("Methanta aawaada?");
//        springBean2.init1(springBean4());
//        springBean2.init2(springBean4());
//        return springBean2;
//    }
//
//    @Bean
//    public SpringBean4 springBean4(){
//        System.out.println("How many times?()");
//        return new SpringBean4();
//    }
}
