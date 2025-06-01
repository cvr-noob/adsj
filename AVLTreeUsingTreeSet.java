import java.util.*;

public class AVLTreeUsingTreeSet {
    public static void main(String[] args) {
        // TreeSet uses Red-Black Tree internally
        TreeSet<Integer> tree = new TreeSet<>();

        // Insert elements (auto-balanced)
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(10);
        tree.add(25);
        tree.add(35);
        tree.add(50);

        // Display in-order traversal (sorted)
        System.out.println("In-order Traversal (Sorted):");
        System.out.println(tree);

        // Search
        int searchKey = 50;
        if (tree.contains(searchKey)) {
            System.out.println("\n" + searchKey + " found");
        } else {
            System.out.println("\n" + searchKey + " not found");
        }

        // Deletion
        tree.remove(40);
        System.out.println("\nAfter deleting 40:");
        System.out.println(tree);

    }
}
