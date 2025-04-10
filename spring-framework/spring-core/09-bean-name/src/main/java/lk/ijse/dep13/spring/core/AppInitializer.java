package lk.ijse.dep13.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();
        System.out.println(ctx);
    }
}
