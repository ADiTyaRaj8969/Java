import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year ");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not a leap year ");
        }
    }
}
