import java.util.Scanner;

public class PositionInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int s=sc.nextInt();
        int[] array=new int[s];
        for(int i=0;i<s;i++){
            System.out.print("enter "+(i+1)+"th element :");
            array[i]=sc.nextInt();

        }
        System.out.print("enter number to know its position in array:");
        int num=sc.nextInt();
        int flag=0;
        for(int i=0;i<s;i++){
            if(array[i]==num){
                flag=i+1;
                break;
            }
        }
        if(flag!=0){
        System.out.print("The position of entered num is :"+flag);}
        else{
            System.out.println("entered number not found");
        }
    }
}
