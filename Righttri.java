import java.util.Scanner;
public class Righttri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enetr a");
        a=sc.nextInt();
        System.out.println("enetr b");
        b=sc.nextInt();
        System.out.println("enetr c");
        c=sc.nextInt();
        if((a+b+c)==180){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }

    
    
    }
}
