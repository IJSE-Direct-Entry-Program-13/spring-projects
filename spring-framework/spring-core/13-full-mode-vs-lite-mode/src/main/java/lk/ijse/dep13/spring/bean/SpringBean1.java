package lk.ijse.dep13.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

    public SpringBean1() {
        System.out.println("SpringBean1()");
    }

//    @Bean
//    public SpringBean3 springBean3(){
//        return new SpringBean3();
//    }

    @Bean
    public SpringBean2 springBean2(SpringBean4 springBean4){
        SpringBean2 springBean2 = new SpringBean2();
        System.out.println("Aaawada?");
        System.out.println("Methanta aawaada?");
        springBean2.init1(springBean4());
        springBean2.init2(springBean4());
        return springBean2;
    }

    @Bean
    public SpringBean4 springBean4(){
        System.out.println("=======================");
        System.out.println("How many times?()");
        SpringBean4 springBean4 = new SpringBean4();
        System.out.println("=======================");
        return springBean4;
    }
}
