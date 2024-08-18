/**
 * Bank
 */
interface Bank {
     float interest();
}
class BOB implements Bank{
    public float interest(){
        return 9.14f;

    }
}
class KOTAK implements Bank{
    public float interest(){
        return 9.34f;

    }
}


public class Interface2 {
    public static void main(String[] args) {
        BOB b=new BOB();
        KOTAK k=new KOTAK();
        System.out.println(b.interest());
        System.out.println(k.interest());
    }
}
