import java.util.Scanner;

public class Exppection2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one num");
        int a=sc.nextInt();
        System.out.println("Enter second num");
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Division not possible");
        }
        System.out.println("Thank you ");
    }
}
