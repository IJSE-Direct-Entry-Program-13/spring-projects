package lk.ijse.dep13.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class AppInitializer {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx);
//        System.out.println("Contains env? " + ctx.containsBean("environment"));
//        Environment env = ctx.getBean(Environment.class);
//        System.out.println(env);
    }
}
