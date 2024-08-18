import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+"th num");
            array[i]=sc.nextInt();

        }
        for(int i=n-1;i>=0;i--){
            System.out.print("the "+(i+1)+"th trem is ");
            System.out.println(array[i]);

            

        }
    }
}
