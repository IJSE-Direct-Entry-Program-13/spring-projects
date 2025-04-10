package lk.ijse.dep13.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {

    public SpringBean2(Environment env) {
        System.out.println("SpringBean2()");
        System.out.println(env.getProperty("os.name"));
        System.out.println(env.getProperty("user.dir"));
        System.out.println(env.getProperty("user.home"));
        System.out.println(env.getProperty("java.io.tmpdir"));
        System.out.println(env.getProperty("os.arch"));
        System.out.println(env.getProperty("path"));
        System.out.println(env.getProperty("shell"));
        System.out.println("=======================");
        System.out.println(env.getProperty("app.name"));
        System.out.println(env.getProperty("app.version"));
        System.out.println(env.getProperty("app.institute"));
        System.out.println(env.getProperty("app.program"));
        System.out.println("=======================");
        System.out.println(env.getProperty("app.settings.user"));
        System.out.println(env.getProperty("app.settings.password"));
    }
}
