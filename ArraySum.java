import java.util.Scanner;
public class ArraySum{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Number:-");
        int n = read.nextInt();
        System.out.println("Enter" + "Numbers");
        int number[]= new int[n];
        for(int i = 0 ; i<n ; i++){
            number[i]= read.nextInt();
        }
        int sum = 0 ;
        for(int elements : number){
         sum += elements;
        }
        System.out.println("Sum of Array :-  "+sum);
        read.close();
    }
}