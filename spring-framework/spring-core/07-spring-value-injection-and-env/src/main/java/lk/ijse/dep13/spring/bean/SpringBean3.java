package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 {

    public SpringBean3(@Value("${os.name}") String a,
                       @Value("${shell}") String b,
                       @Value("${user.name}") String c,
                       @Value("${app.name}") String d,
                       @Value("${app.version}") String e,
                       @Value("${isuranga.gf}") String f) {
        System.out.println("SpringBean3=========================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
