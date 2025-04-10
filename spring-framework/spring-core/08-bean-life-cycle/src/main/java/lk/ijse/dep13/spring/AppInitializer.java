package lk.ijse.dep13.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();
//        ctx.close();
        System.out.println(ctx.getBean("springBean"));
        System.out.println(ctx);
//        ctx.close();
    }
}
