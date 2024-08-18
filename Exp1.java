import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int flg=0;

        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            
            flg=0;
            for(int j=2;j<=i/2;j++){
                
                    if(i%j==0){
                        flg++;  
                    }

            }
            if(flg==0){
                System.out.println(i);
            }
        }
    }
}
