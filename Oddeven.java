import java.util.Scanner;

public class Oddeven {
    public static void findEvenorOdd(int a){
        if(a%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr any number ");
        int a=sc.nextInt();
        findEvenorOdd(a);


    
    }
}
