import java.util.Scanner;

public class Tese2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many num to store");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter "+i+"th num");
            array[i]=sc.nextInt();
            System.out.println();

        }
        for(int i=0;i<n;i++){
            System.out.print("the "+i+"th trem is= ");
            System.out.print(+(array[i]+1));
            System.out.println();

            

        }
       sc.close();
    }
    
}
