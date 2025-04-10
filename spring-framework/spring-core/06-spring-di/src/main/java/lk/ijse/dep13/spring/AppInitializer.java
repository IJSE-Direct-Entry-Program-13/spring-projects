package lk.ijse.dep13.spring;

import lk.ijse.dep13.spring.bean.Isuranga;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //ctx.refresh();
        System.out.println(ctx);
        System.out.println("Contains isuranga definition? " + ctx.containsBeanDefinition("isuranga"));
        System.out.println("Contains isuranga? " + ctx.containsBean("isuranga"));
        System.out.println("Contains savi definition? " + ctx.containsBeanDefinition("savi"));
        System.out.println("Contains savi? " + ctx.containsBean("savi"));

        Isuranga isuranga = (Isuranga) ctx.getBean("isuranga");
        isuranga.kissMyGf();
    }
}
