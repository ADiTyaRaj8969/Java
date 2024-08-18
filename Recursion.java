import java.util.Scanner;

public class Recursion {
    public static void  PrintNum(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        
        System.out.println(n);
        PrintNum(n-1);
    }
    public static int   FacOfn(int n){
        if(n==1){
           
            return 1;
        }
        
        return FacOfn(n-1)*n;
    }

    public static void  SumOfn(int n,int u,int sum){

        if(u==n){
            sum+=u;
            System.out.println("The sum of n natural num is :"+sum);
            return ;
        }
        
        sum+=u;
        
        SumOfn(n, u+1, sum);
    }
    public static void  PrintNum2(int n){

        if(n==5){
            System.out.println(n);
            return ;
        }
        
        System.out.println(n);
        n+=1;
        PrintNum2(n);
    }
    public static void PrintFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        PrintFib(b, c, n-1);
    }
    public static int PrintXPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return PrintXPow(x, n-1)*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Any Number to Print That num to one ");
        //int n=sc.nextInt();
        //  PrintNum(n);
        //  PrintNum2(1);
        // int sum=0;
        // SumOfn(8, 1, sum);
    //     System.out.println("Enter any num to find factorial");
    //     int n=sc.nextInt();
    //     System.out.println("Fac of "+n+" is "+FacOfn(n));
    System.out.println("enter the value of n to print fib");
    int n=sc.nextInt();
     int a=0,b=1;
     System.out.println(a);
     System.out.println(b);
     //PrintFib(a, b, n-2);
    // System.out.println("enter the value of n to print X to pow n");
    // int n=sc.nextInt();
    // System.out.println("enter the value of X");
    // int x=sc.nextInt();
    // System.out.println(PrintXPow(x, n));
    

    }
}
