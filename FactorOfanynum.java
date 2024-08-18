import java.util.Scanner;

public class FactorOfanynum {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        num=sc.nextInt();
        System.out.println("factors are ");
        int i=1;
        while (i<=num) {
            if(num%i==0){
                System.out.print("\t"+i);
            }
            i++;
            
        }
    }
}
