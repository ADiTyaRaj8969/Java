/**
 * VehInt
 
 */
interface VehInt {

int a=10;
public void left();
public void right();
public void accel();
public void slow();

    
}
class Car implements VehInt{
    public 
    void left(){
        System.out.println("LEFT");
    }
    public void right(){
        System.out.println("right");
    }
    public void accel(){
        System.out.println("Aage bahd");
    }
    public void slow(){
        System.out.println("rukjao");
    }
}


public class InterFace {
    public static void main(String[] args) {
        Car c=new Car();
        c.left();
        c.right();
        c.accel();
        c.slow();
        VehInt v=new Car();
        v.accel();

    }
}
