import java.util.Scanner;
public class Power{
    public static int calculatePower(int base, int exp){
        int result = 1 ;
        for(int i = 0 ; i < exp ; i ++){
            result *= base ;
        }
        return result;
    }
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
            System.out.println("Enter Base");
            int base = read.nextInt();
            System.out.println("Enter Exponent");
            int exp = read.nextInt();
            int power = calculatePower(base,exp);
System.out.println("Answer is "+power);
        }
    }
