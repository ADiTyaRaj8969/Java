import java.util.Scanner;

public class StringHelloW {
    public static void main(String[] args) {
        String hw=new String(" Hello ");
        System.out.println(hw);
        String hw2="Hello World";
        System.out.println(hw2);
        System.out.println("enter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String one="Ansh"+" Raythatha";
        System.out.println(one);
        String two=" V";
        String con=one.concat(two);
        System.out.println(con);
        String forma=String.format("%s%s",one, two);
        System.out.println(forma);
        System.out.println(one.substring(4));
        System.out.println(one.substring(0,4));
        System.out.println(hw.trim());
        System.out.println(hw2.startsWith("H"));
        System.out.println(hw2.endsWith("d"));
        System.out.println(hw2.charAt(0));
        System.out.println(hw2.charAt(1));
        System.out.println(one.toLowerCase());
        System.out.println(one.toUpperCase());
        sc.close();
    }
}
