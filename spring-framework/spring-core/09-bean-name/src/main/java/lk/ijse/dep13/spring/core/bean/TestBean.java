package lk.ijse.dep13.spring.core.bean;

public class TestBean {

    public TestBean() {
        System.out.println("TestBean()");
    }

    public void init(){
        System.out.println("Initialization logic goes here");
    }

    public void destroy(){
        System.out.println("Finalization logic goes here");
    }
}
