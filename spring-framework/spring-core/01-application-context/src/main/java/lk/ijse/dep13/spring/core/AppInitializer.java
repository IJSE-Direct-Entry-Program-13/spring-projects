package lk.ijse.dep13.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/core-context.xml");
        System.out.println(context);
    }
}
