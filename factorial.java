import java.util.Scanner;
public class factorial {
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = read.nextInt();
        int number = fac(n);
        System.out.println("Factorial is"+number);
        read.close();    }
    
}
