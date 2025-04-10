package lk.ijse.dep13.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Isuranga implements Injector{

    @Autowired
    //private GoodGirl[] gfs;
    //private List<GoodGirl> gfs;
    //private Collection<GoodGirl> gfs;
    //private Set<GoodGirl> gfs;
    private Map<String, GoodGirl> gfs;

    public void kissMyGf(){
        for (int i = 0; i < 5; i++) {
            for (GoodGirl gf : gfs.values()) {
                gf.kiss();
            }
        }
//        System.out.println(Arrays.toString(gfs)        );
        System.out.println(gfs );
    }

    //    public void kissMyGf(){
//        while (true){
//            girlFriend.kiss();
//        }
//    }

    // Property/Field Injection
//    @Autowired
//    @Qualifier("kondeadiga")
//    @EighteenPlus
//    @Ahinsaka
//    private GoodGirl girlFriend;
//
//    public Isuranga() {
//        System.out.println("Isuranga()");
//    }
//
//    // [Setter] Method Injection
//    //@Autowired
//    public void setGirlFriend(GoodGirl girlFriend) {
//        this.girlFriend = girlFriend;
//    }
//
//    // @Autowired
//    // Constructor Injection
////    public Isuranga(GoodGirl girlFriend) {
////        System.out.println("Isuranga()");
////        this.girlFriend = girlFriend;
////    }
//
//
    //@Autowired
    @Override
    public void setDeps(GoodGirl girl) {
//        this.girlFriend = girl;
    }
}

interface Injector{
    void setDeps(GoodGirl girl);
}
