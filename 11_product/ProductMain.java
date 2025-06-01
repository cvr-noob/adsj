import java.util.*;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left over by nextInt()

        // Loop to collect product data from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter Product Type: ");
            String type = scanner.nextLine();

            System.out.print("Enter Product Rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            // Create the Product object and add it to the list
            products.add(new Product(id, name, price, type, rating));
        }

        List<Product> productsWithRating = products.stream()
                .filter(p -> p.rating >= 4 && p.rating <= 5)
                .toList();
        System.out.println("\nProducts with rating between 4 & 5: " + productsWithRating);

        System.out.print("\nEnter n: ");
        List<Product> richProducts = products.stream()
                .filter(p -> p.price > 10000)
                .limit(scanner.nextInt())
                .toList();
        System.out.println("Products with price > 10000: " + richProducts);

        Map<String, Long> map = products.stream()
                .collect(Collectors.groupingBy(p -> p.type, Collectors.counting()));
        System.out.println(map);

        OptionalDouble avg = products.stream()
                .filter(p -> p.type.equals("Electronics"))
                .mapToDouble(p -> p.rating)
                .average();
        if (avg.isPresent()) {
            System.out.println("\nAvg price of Electronics: " + avg.getAsDouble());
        } else {
            System.out.println("\nNo electronics found!");
        }
    }
}
