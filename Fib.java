import java.util.Scanner;

public class Fib {
    public static void fib(int n) {
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(+a);
                
            }

        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
    }
}
