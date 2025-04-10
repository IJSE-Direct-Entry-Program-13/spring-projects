package lk.ijse.dep13.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
//@PropertySources({@PropertySource("classpath:/application.properties"),
//        @PropertySource("classpath:/settings.properties")})
//@PropertySource("classpath:/application.properties")
//@PropertySource("classpath:/settings.properties")
@PropertySource("classpath:*.properties")
@PropertySource("file:${user.home}/Desktop/settings.properties")
public class AppConfig {

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

//    @Bean
//    public Integer number(){
//        return 10;
//    }
//
//    @Primary
//    @Bean
//    public Integer number2(){
//        return 20;
//    }
}
