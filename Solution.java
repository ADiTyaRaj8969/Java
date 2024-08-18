import java.util.Scanner;

public class Solution {
    public static void sol(int input){
        Scanner ne=new Scanner(System.in);
        int pos=0,neg=0 ,zer=0;
        while (input==1) {
            System.out.println("Enter any number");
            int num=ne.nextInt();
            
            if(num>0){
                pos++;

            }
            else if(num<0){
                neg++;

            }
            else{
                zer++;

            }
            System.out.println("Enter 1 to continue and 0 to quit ");
            input=ne.nextInt();
        }
        System.out.println("total positive ="+pos);
        System.out.println("total negative ="+neg);
        System.out.println("total zero ="+zer);
    }
    public static void main(String[] args) {
        
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to Start ");
        input = sc.nextInt();
        sol(input);
        
    }
}
