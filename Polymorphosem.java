class Addition{
    int i,j,k;
    void add(int a){
        i=a;
        System.out.println(i);
    }
    void add(int a, int b){
        i=a;
        j=b;
        System.out.println("Addition is "+(i+j));
    }
    void add(int a, int b, int c){
        i=a;
        j=b;
        k=c;
        System.out.println("Addition is "+(i+j+k));
    }
}

public class Polymorphosem {
    public static void main(String[] args) {
        Addition Obj=new Addition();
        Obj.add(20);
        Obj.add(20,30);
        Obj.add(20,30,40);
    }
}
