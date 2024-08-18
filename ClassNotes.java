import java.util.Scanner;

public class ClassNotes {
    String name;
    String gender;
    int age;
    int roll;
    public static void main(String[] args) {
        ClassNotes p1=new ClassNotes();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        p1.name=sc.nextLine();
        
        System.out.println("gender");
        p1.gender=sc.nextLine();
        System.out.println("Age");
        p1.age=sc.nextInt();
        System.out.println("Roll");
        p1.roll=sc.nextInt();
        System.out.println();
        System.out.println(p1.name);
        System.out.println(p1.gender);
        System.out.println(p1.age);
        
        System.out.println(p1.roll);
        System.out.println();

        p1.name="Ansh Raythatha";
        p1.age=19;
        p1.gender="Male";
        p1.roll=42;
        System.out.println(p1.name);
        System.out.println(p1.gender);
        System.out.println(p1.age);
        
        System.out.println(p1.roll);

    }
}
