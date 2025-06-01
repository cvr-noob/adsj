import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList elements:");
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());

        System.out.println("\nLinkedList elements:");
        list = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        iter = list.iterator();

        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
