import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int l,w;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of length and Width ");
        l=sc.nextInt();
        w=sc.nextInt();
        System.out.println("area of rect="+(l*w));
        System.out.println("peremeter of rect="+2*(l+w));
        


    }
}
