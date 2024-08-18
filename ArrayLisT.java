import java.util.*;
public class ArrayLisT{
    public static void main(String []args){
        ArrayList<String> Aditya = new ArrayList<String>();
        Aditya.add("Ravi");
        Aditya.add("Vijay");
        Aditya.add("Ajay");
        Aditya.add("Agni");
        for(String s2 : Aditya)
        System.out.println("Elements :"+s2);
        Aditya.remove("Ravi");
        for(String s : Aditya)
        System.out.println("After remove :"+s);
        Aditya.clear();
        System.out.println(Aditya.size());
    }
    
}
