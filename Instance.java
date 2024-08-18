class Parent{
void Pri(){
    System.out.println("parent");
}
}
class Child extends Parent {


}

public class Instance {
   

    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
       
        System.out.println(p instanceof Parent);
        System.out.println(c instanceof Child);
        System.out.println(c instanceof Child);

    }
}
