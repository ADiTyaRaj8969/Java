import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row of 1st matrix");
        int row1=sc.nextInt();
        System.out.println("enter the col of 1st matrix");
        int col1=sc.nextInt();
        System.out.println("enter the row of 2nd matrix");
        int row2=sc.nextInt();
        System.out.println("enter the col of 2nd matrix");
        int col2=sc.nextInt();
        int[][] matrix1=new int[row1][col1];
        int[][] matrix2=new int[row2][col2];
        int[][] multi=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("enter 1st matrix"+(i+1)+"row and "+(j+1)+"col element");
                matrix1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("enter 2nd matrix"+(i+1)+"row and "+(j+1)+"col element");
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multip of matrix is ");
        if(row1==col2){
            for(int i=0;i<row1;i++){    
                for(int j=0;j<col2;j++){    
                multi[i][j]=0;      
                for(int k=0;k<col2;k++)      
                {      
                multi[i][j]+=matrix1[i][k]*matrix2[k][j];      
                }
                System.out.print(multi[i][j]+" ");   
                }  
                System.out.println();    
                }    

        }
        

    }
}
