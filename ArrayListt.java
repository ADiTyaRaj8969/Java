import java.util.ArrayList ;
public class ArrayListt {
 public static void main(String[]args){
    ArrayList<String> Language = new ArrayList<>();
    Language.add ("Python") ;
    Language.add ("Php") ;
    Language.add ("R") ;
    Language.add ("C++") ;
    Language.add ("Java") ;
    System.out.println("Array List :-" + Language);
    Language.add(1,"Sql");
    System.out.println("Updated Array List:-" + Language);
 }   
}
