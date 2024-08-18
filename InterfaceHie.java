/**
 * A
 */
interface A {
    void met1();
    void met2();

    
}
interface B extends A{
    void met3();
}
interface C extends A{
    void met4();
}
class b2 implements B{
    public void met1(){
        System.out.println("Suhag Bhismarino");
    }
    public void met2(){
        System.out.println("suhag MotherBoard");
    }
    public void met3(){
        System.out.println("Suhag Pikachu");
    }
}
class c2 implements C{
    public void met1(){
        System.out.println("Suhag Bhismarino squre");
    }
    public void met2(){
        System.out.println("suhag MotherBoard squre");
    }
    public void met4(){
        System.out.println("Suhag Pikachu squre");
    }
}

public class InterfaceHie {
    public static void main(String[] args) {
        c2 a=new c2();
        b2 b=new b2();
        a.met1();
        a.met2();
        a.met4();
        b.met1();
        b.met2();
        b.met3();
    }
}
