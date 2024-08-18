public class ConstruOverload {
    String name;
    int age;
    ConstruOverload(){
        name="ansh";
        age=19;

    }
    ConstruOverload(String name ){
        name="ansh";
        age=19;

    }
    ConstruOverload(String name,int age){
        name="ansh";
        age=19;

    }
    void Print(){
       
    }
    public static void main(String[] args) {
        ConstruOverload x=new ConstruOverload("Ansh",19);
        
        System.out.println("name is "+x.name);
        System.out.println("age is "+x.age);
    }
}
