package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@EighteenPlus
@Qualifier("kondeadiga")
@Primary
@Component
@Order(1)
public class Savi implements GoodGirl {

    public Savi() {
        System.out.println("Savi()");
    }

    @Override
    public void kiss() {
        System.out.println("Savi: Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaa");
        System.out.println("Savi: Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaa18+");
    }
}
