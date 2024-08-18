import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Q1{
    public static void main(String[]args){
        Queue<String> Name = new LinkedList<>();     
        Name.add("John");
        Name.add("Smith");
        Name.add("John");
        Name.add("Angel");
        Name.add("Black");
        System.out.println("Array:-"+Name);
         Queue<String> uniqueQueue = new LinkedList<>();
        for (String str : Name) {
            if (!uniqueQueue.contains(str)) {
                uniqueQueue.offer(str);
            }
        }
        List<String> uniqueList = new ArrayList<>(uniqueQueue);
        System.out.println("Output: " + uniqueList);
    }
}
