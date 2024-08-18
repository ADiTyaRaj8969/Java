class shape{
    void Sha(){
        System.out.println("Shape");
    }
}
class Circle extends shape{
    void Sha(){
        System.out.println("circle");
    }
}
class Squre extends shape{
    void Sha(){
        System.out.println("Squre");
    }
}



public class Overrind {
    public static void main(String[] args) {
        Squre Obj=new Squre();
        
        shape Obj2 =new shape();
        Circle OBj3=new Circle();
        shape r;
        r=Obj;
        r.Sha();
        r=OBj3;
        r.Sha();
        
    }
}
