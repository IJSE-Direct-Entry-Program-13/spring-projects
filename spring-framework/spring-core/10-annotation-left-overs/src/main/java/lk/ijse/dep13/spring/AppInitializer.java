package lk.ijse.dep13.spring;

import lk.ijse.dep13.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx);
    }
}
