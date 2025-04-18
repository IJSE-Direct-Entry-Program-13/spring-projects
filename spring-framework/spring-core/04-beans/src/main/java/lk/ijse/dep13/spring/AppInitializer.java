package lk.ijse.dep13.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        System.out.println(ctx);
//        BeanDefinition springBean = ctx.getBeanDefinition("springBean");
        System.out.println(ctx.containsBeanDefinition("springBean"));

    }
}
