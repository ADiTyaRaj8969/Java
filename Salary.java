import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Salary");
        int sal=sc.nextInt();
        int totalSal;
        if(sal<1500){
            totalSal=sal+((sal*10)/100)+((sal*90)/100);

            System.out.println("Total Salary="+totalSal);
        }
        else if(sal>=1500){
            totalSal=sal+500+((sal*98)/100);
            System.out.println("your Total Salary is ="+totalSal);
        }

    }
}
