import java.util.Scanner;

public class Fibonacci {
    public static int feb(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return feb(n-1)+feb(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

     System.out.println(+feb(n));  
     sc.close();
    }
}
