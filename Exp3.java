import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
       
        int a=5;
        int i=0,d=0,e=1,b=0;
              for(i=0;i<=a;i++)
                {
                  if(i<=0)
              d=i;
                  else
                  {
                    d=e+b;                                                                      
                    
                    e=b;
                    b=d;
                System.err.print(+e);
                System.out.print(" ");
                  }
              }
              System.out.println(d);
       
    
              
          

    }
}
 // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name=sc.nextLine();
        // System.out.println("enter your contact no");
        // double num=sc.nextDouble();
        // System.out.println("enter your salary");
        // int sal=sc.nextInt();
        // System.out.println("Your Employee code is 042");
       
        // System.out.println("Enter Your Employee code");
        // int Emp=sc.nextInt();
        // if(Emp==042){
        //     System.out.println("Your name is "+name);
        //     System.out.println("Your Contact no is "+num);
        //     System.out.println("Your Salary is "+sal);

        //}
