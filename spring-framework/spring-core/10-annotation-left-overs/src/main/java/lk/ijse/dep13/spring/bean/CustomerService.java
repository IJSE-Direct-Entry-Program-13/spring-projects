package lk.ijse.dep13.spring.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements BeanNameAware {

    @Autowired(required = false)
    private CustomerRepository customerRepository;

    public CustomerService(SpringBean springBean) {
        System.out.println("CustomerService()");
        System.out.println("SpringBean:" + springBean);
        System.out.println("Repo:" + customerRepository);
        System.out.println("-------------------------");
    }

    @PostConstruct
    public void init(){

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("CustomerService.beanNameAware()");
        System.out.println("Repo:" + customerRepository);
        System.out.println("-------------------------");
    }
}
