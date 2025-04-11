package lk.ijse.dep13.requesttime;

import lk.ijse.dep13.requesttime.interceptor.MyHttpInterceptor;
import lk.ijse.dep13.requesttime.interceptor.MyHttpInterceptor2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.setUseTrailingSlashMatch(true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHttpInterceptor())
                .addPathPatterns("/hello/**");
        registry.addInterceptor(new MyHttpInterceptor2())
                .addPathPatterns("/hello/**");
    }
}
