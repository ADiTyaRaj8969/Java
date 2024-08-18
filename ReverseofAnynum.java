import java.util.Scanner;

public class ReverseofAnynum {
    public static void main(String[] args) {
        int num,re=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        num=sc.nextInt();
        int rev=0,a=0;
        re=num%10;
        re=re*10;
        rev=re;
        num=num/10;

    

        
        while (num!=0) {
            re=num%10;
            
            rev=rev+re;
            rev=rev*10;
            
            num/=10;

            
        }
        rev=rev/10;
        System.out.print(+rev);
       
    }
}
