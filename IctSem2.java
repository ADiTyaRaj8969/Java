import java.util.Scanner;

class sub{
    int roll;
    String name;
    void EnterDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll no");
        roll=sc.nextInt();
        System.out.println("enter the name");
        name=sc.nextLine();
    }
}
class Opp extends sub{
    int oppmar;
    void takesoopmarks(){
        System.out.println("Enter the Marks Of OOP");
        Scanner sc=new Scanner(System.in);
        oppmar=sc.nextInt();

    }

}
class Maths extends sub{
    int Mathsmar;
    void takesmathsmarks(){
        System.out.println("Enter the Marks Of MATHS");
        Scanner sc=new Scanner(System.in);
        Mathsmar=sc.nextInt();
        
    }

}
class Dld extends sub{
    int Dldmar;
    void takesDldmarks(){
        System.out.println("Enter the Marks Of DLD");
        Scanner sc=new Scanner(System.in);
        Dldmar=sc.nextInt();
        
    }

}
class Ed extends sub{
    int Edmar;
    void takesEdmarks(){
        System.out.println("Enter the Marks Of OOP");
        Scanner sc=new Scanner(System.in);
        Edmar=sc.nextInt();
        
    }

}


public class IctSem2 {
    public static void main(String[] args) {
        sub Stu1=new sub();
        Stu1.EnterDetails();
        sub Stu2=new sub();
        Stu2.EnterDetails();
        sub Stu3=new sub();
        Stu3.EnterDetails();
    }
}
