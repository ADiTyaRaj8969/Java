import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one string :");
        String one =sc.nextLine();
        System.out.println("enter second string :");
        String sec =sc.nextLine();

        System.out.println("Enter 1 To find the String Length\nEnter 2 To cat the two string using +:\nEnter 3 To cat the two string cat fun\nEnter 4 To cat the two string format\nEnter 5 To substring using single index\nEnter 6 To substring using two index\nEnter 7 To substring using two index");
        System.out.println("enter 8 to trim\nenter 9 to to check its starts with \nenter 10 to to check its ends with");
        System.out.println("enter 11 to change to upper case\nenter 11 to change to lower case");
        int n=sc.nextInt();
        switch (n) {
            case 1:
            System.out.println(one.length());
            System.out.println(sec.length());
                
                break;
                case 2:
                String cat=one+sec;
        System.out.println(cat);
        
            default:
            case 3:
                String cat2=one.concat(sec);
        System.out.println(cat2);
        
        
            default:
                break;
        }
    }
}
