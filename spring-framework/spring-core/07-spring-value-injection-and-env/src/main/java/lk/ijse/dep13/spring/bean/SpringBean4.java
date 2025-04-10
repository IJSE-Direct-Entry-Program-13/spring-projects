package lk.ijse.dep13.spring.bean;

import lk.ijse.dep13.spring.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SpringBean4 {

    public SpringBean4(@Value("#{10+15}") int x,
                       @Value("#{('ijse' + 'dep' + (5 * 2 + 3)).toUpperCase()}") String name,
                       @Value("#{'dep'.toUpperCase()}") String program,
                       @Value("#{T(Math).random()}") double number,
                       @Value("#{T(java.time.LocalDate).now()}") LocalDate today,
                       @Value("#{new lk.ijse.dep13.spring.Customer(1, 'Kasun')}") Customer customer) {
        System.out.println("SpringBean4=========================");
        System.out.println("x=" + x);
        System.out.println("name=" + name);
        System.out.println("program=" + program);
        System.out.println("number=" + number);
        System.out.println("today=" + today);
        System.out.println("customer=" + customer);
    }
}
