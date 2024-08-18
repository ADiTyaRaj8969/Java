import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of row");
        int row=sc.nextInt();
        System.out.println("enter the number of col");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("enter 1st matrix"+(i+1)+"row and "+(j+1)+"col element");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("\t"+matrix[i][j]);

               
                
            }
            System.out.println();
        }

    }
}
