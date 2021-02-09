import java.util.*;
public class QueueEx{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("four");
        System.out.println(queue);

        queue.remove("One");
        System.out.println("After Remove One"+queue);

        System.out.println("Queue Size "+queue.size());
        System.out.println("Is Queue Contains One? "+queue.contains("One"));

        //To Empty
        queue.clear();
    }
}