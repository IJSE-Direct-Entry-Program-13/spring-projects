package lk.ijse.dep13.finalexample;

import lk.ijse.dep13.finalexample.interceptor.MyInterceptor1;
import lk.ijse.dep13.finalexample.interceptor.MyInterceptor2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor1())
                .addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2())
                .addPathPatterns("/**");
    }
}
