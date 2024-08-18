abstract class Animal{
    public abstract void walk();
    public abstract void eat();
    public abstract void sleep();
    public abstract void run();
    public abstract void move();
}
class Dog extends Animal{
    
    public  void walk(){
        System.out.println("chamak chaloo");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Haddi");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("Aa chi");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Bhaag Arjun Bhaag");
        
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Move it");
        
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Dog d= new Dog();
        Tiger t=new Tiger();
        d.walk();
        d.eat();
        d.sleep();
        d.run();
        d.move();
        t.walk();
        t.eat();
        t.sleep();
        t.run();
        t.move();
    }
}
class Tiger extends Animal{
    
    public  void walk(){
        System.out.println("Appun heh Bhagwan hai");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("manus");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("Tapu ke papa uttho");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Maut ka nannga nach");
        
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("its my style");
        
    }
}


