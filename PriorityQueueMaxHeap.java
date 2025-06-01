import java.util.*;

public class PriorityQueueMaxHeap {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator for max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(50);
        maxHeap.add(40);
        System.out.println("heap data");
        System.out.println(maxHeap);

        System.out.println("Max Heap Priority Queue:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // Highest priority (max) first
        }
    }
}
