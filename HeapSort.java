import java.util.*;

public class HeapSort {
    public static List<Integer> heapSort(List<Integer> inputList) {
        // Create a max-heap using reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements to the max heap
        maxHeap.addAll(inputList);

        // Poll from heap to get sorted elements in descending order
        List<Integer> sortedList = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            sortedList.add(maxHeap.poll());
        }

        // For ascending order, reverse the result
        Collections.reverse(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(30, 10, 40, 20, 50);

        System.out.println("Original List: " + data);

        List<Integer> sorted = heapSort(data);

        System.out.println("Heap Sorted (Ascending): " + sorted);
    }
}
