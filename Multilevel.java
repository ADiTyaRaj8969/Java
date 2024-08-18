class A{
    int i,j;
    void showij(){
        System.out.println("i="+i+"and j="+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k="+k);
    }
    void add_ijk(){
        System.out.println("i+j+k="+(i+j+k));
    }}
    class C extends B{
        int m;
        void showm(){
            System.out.println("m="+m);
        }
        void add_ijkm(){
            System.out.println("i+j+k+m="+(i+j+k+m));
        }
    }

public class Multilevel {
    public static void main(String[] args) {
        C ObjC = new C();
        
    }
}
