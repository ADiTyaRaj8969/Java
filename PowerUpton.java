import java.util.Scanner;

public class PowerUpton {
    public static int pow(int x,int n){
        for(int i=1;i<n;i++){
            x*=x;
        }
        
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number X");
        int x=sc.nextInt();
        System.out.println("enter value of n to find x to power n");
        int n=sc.nextInt();
        
        //
        int result=pow(x, n);
        System.out.println("The Result is "+result);

    }
}
