package lk.ijse.dep13.spring.bean;

public class SpringBean2 {

    public SpringBean2() {
        System.out.println("SpringBean2()");
    }

    public void init1(SpringBean4 springBean4){
        System.out.println("SpringBean4 init1");
    }

    public void init2(SpringBean4 springBean4){
        System.out.println("SpringBean4 init2");
    }
}
