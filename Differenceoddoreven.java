import java.util.Scanner;

public class Differenceoddoreven {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("Difference is ="+(a-b));
        if((a-b)%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }
    }
}
