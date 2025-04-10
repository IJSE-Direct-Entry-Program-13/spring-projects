package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@EighteenPlus
@Qualifier("kondeadiga")
@Ahinsaka
@Primary
@Component
@Order(2)
public class Mali implements GoodGirl {

    public Mali() {
        System.out.println("Mali()");
    }

    @Override
    public void kiss() {
        System.out.println("Mali: Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaa");
        System.out.println("Mali: Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaa:18+");
    }
}
