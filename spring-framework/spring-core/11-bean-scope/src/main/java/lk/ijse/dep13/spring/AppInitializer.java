package lk.ijse.dep13.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();
        System.out.println(ctx);
        System.out.println("ContainsBeanDefinition? " + ctx.containsBeanDefinition("springBean"));
        System.out.println("----------------------------");
        System.out.println(ctx.getBean("springBean"));
        System.out.println(ctx.getBean("springBean"));
        System.out.println(ctx.getBean("springBean"));
    }
}
