import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a list of strings
        LinkedList<String> stringList = new LinkedList<>(Arrays.asList("john", "smith", "john", "angel", "black"));
        
        // Create a queue to store unique elements
        Queue<String> uniqueQueue = new LinkedList<>();
        
        // Iterate through the list and add unique elements to the queue
        for (String str : stringList) {
            if (!uniqueQueue.contains(str)) {
                uniqueQueue.offer(str);
            }
        }
        
        // Convert the queue back to a list
        List<String> uniqueList = new ArrayList<>(uniqueQueue);
        
        // Print the resulting list
        System.out.println("Input: " + stringList);
        System.out.println("Output: " + uniqueList);
    }
}