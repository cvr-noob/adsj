import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsingStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Person> setA = new HashSet<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Income: ");
            double income = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
            setA.add(new Person(name, age, income));
        }
        System.out.println("Set A: " + setA.toString());

        Set<Person> setB = setA.stream()
                .filter(p -> p.age > 60)
                .collect(Collectors.toSet());
        System.out.println("Set B: " + setB);

        Set<Person> setC = setA.stream()
                .filter(p -> p.income < 10000)
                .collect(Collectors.toSet());
        System.out.println("Set C: " + setC);

        Set<Person> setB_setC = setB.stream()
                .filter(setC::contains)
                .collect(Collectors.toSet());
        System.out.println("B & C: " + setB_setC);
    }
}
