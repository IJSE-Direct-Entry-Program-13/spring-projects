public class Demo {

    public static void main(String[] args) {
        Isuranga isuranga = new Isuranga();
        while (true) {
            isuranga.kissHer();
        }
    }
}

class Isuranga {
    GoodGirl gf = GoodGirlFactory.getGoodGirl();
    void kissHer(){
        gf.kiss();
    }
}

interface GoodGirl{
    void kiss();
}

class GoodGirlFactory {
    public static GoodGirl getGoodGirl() {
        return new Maneesha();
    }
}

class Savi implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmaaa");
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmaaa");
    }
}

class Maneesha implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaaaaaaaaaaaaaaa");
        System.out.println("Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaaaaaaaaaaaaaaaaaaaa 18+");
    }
}

class Senehalatha {
    void abc(){
        System.out.println("Ummmmmmmaaaa....!");
    }
}