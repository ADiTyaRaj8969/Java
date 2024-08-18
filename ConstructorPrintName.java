public class ConstructorPrintName {
    String student1; 
    String student2;
    String student3;
    int avg;
    ConstructorPrintName(int a,int b,int c){
        student1="Bhavin";
        student2="Viraj";
        student3="Kaushal";
        avg=a+b+c/3;
    }
    public static void main(String[] args) {
        ConstructorPrintName x=new ConstructorPrintName(90,80,85);
        System.out.println(x.student1);
        System.out.println(x.student2);
        System.out.println(x.student3);
        System.out.println(x.avg);
        
    }
}
