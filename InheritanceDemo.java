class A{
    int i;
    int j;
    void showij(){
        System.out.println("i="+i+" and j="+j+" ");
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k="+k);
    }
    void add(){
        System.out.println("i+j+k="+(i+j+k));
    }

}
class C extends A{
    int m;
    void showm(){
        System.out.println("m="+m);
    }
    void add_ijm(){
        System.out.println("i+j+m="+(i+j+m));
    }
}



public class InheritanceDemo {
    public static void main(String[] args) {
        
        A ObjA=new A();
        ObjA.i=20;
        ObjA.j=10;

        B ObjB=new B();
        ObjB.k=50;
        ObjB.i=20;
        ObjB.j=10;
         ObjA.showij();
         ObjB.showk();
         ObjB.add();

         C ObjC=new C();
         ObjC.i=20;
        ObjC.j=10;
        ObjC.m=60;
        ObjC.add_ijm();
    }
}
