import java.util.Scanner;
public class ReverseString {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string:-");
        String S = read.nextLine();
        String R = reverse(S);
        System.out.println("The reversed string is: " + R);
  }
  public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
 }
