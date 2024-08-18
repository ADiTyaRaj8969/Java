class Students{
    String name;
    int roll;
    float cgpa;
    void print(String n){
        name=n;
        System.out.println("name is "+name);
    }
    void print(String n,int r){
        name=n;
        roll=r;
        System.out.println("Name is "+name+" and roll no is"+roll);
    }
    void print(String n,int r,float c){
        name=n;
        roll=r;
        cgpa=c;
        System.out.println("Name is "+name+" and roll no is"+roll+" Cgpa is "+cgpa);
    }
}



public class Poly {
    public static void main(String[] args) {
        Students Obj=new Students();
        Obj.print("Ansh Raythatha");
        Obj.print("Ansh Raythatha",42);
        Obj.print("Ansh Raythatha",42,9.4f);

        
    }
}
