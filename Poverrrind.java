class Animal{
    void sound(){
        System.out.println("pucch");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Faki kais");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Ha But With extra chuno");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("AA Thu");
    }
}

public class Poverrrind {
    public static void main(String[] args) {
        Animal Obj1=new Animal();
        Dog Obj2=new Dog();
        Cat Obj3=new Cat();
        Lion Obj4=new Lion();
        Obj1.sound();
        Obj2.sound();
        Obj3.sound();
        Obj4.sound();
    }
}
