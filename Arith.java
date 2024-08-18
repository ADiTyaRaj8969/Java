import java.util.Scanner;
public class Arith{
    public static int add(int num1 , int num2){
        return num1 + num2 ;
    }
    public static int sub(int num1 , int num2){
        return num1 - num2 ;
    }
    public static int mul(int num1 , int num2){
        return num1 * num2 ;
    }
    public static int div(int num1 , int num2){
        return num1 / num2 ;
    }
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("enter first number:-");
        int num1 = read.nextInt();
        System.out.println("enter Second Number:-");
        int num2 = read.nextInt();
        int addition = add(num1,num2);
        int subt = sub(num1,num2);
        int mult = mul(num1,num2);
        int divide = div(num1,num2);
        System.out.println("Addition = "+ addition);
        System.out.println("Difference ="+ subt);
        System.out.println("Product ="+ mult);
        System.out.println("Quotient = "+divide);
        read.close();
    }
}