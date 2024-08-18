import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        n=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.print(+n);
            System.out.print("*"+i);
            System.out.print("="+(n*i));
            System.out.println();
            i++;
        }
    }
}
