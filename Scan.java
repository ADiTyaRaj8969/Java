import java.util.Scanner;
public class Scan {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Your Employee Id :- "); 
        int employeeId = read.nextInt();
        System.out.println("Enter Your Name:-");
        String Name = read.next();
        System.out.println("Enter Your Date of Joining:- ");
        String DateOfJoining = read.next();
        System.out.println("Employee Id :- " +employeeId);
        System.out.println("Name:-" +Name);
        System.out.println("Date Of Joining :- " +DateOfJoining);
        read.close();
    }
    
}
