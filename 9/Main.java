import java.util.*;

class Person {
    double income;
    int age;
    String name;

    Person(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Income: " + income + ")";
    }
}

public class Main {
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

        Set<Person> setB = new HashSet<>();
        Set<Person> setC = new HashSet<>();

        for (Person p : setA) {
            if (p.age > 60) {
                setB.add(p);
            }
            if (p.income < 10000) {
                setC.add(p);
            }
        }
        System.out.println("Set B: " + setB.toString());
        System.out.println("Set C: " + setC.toString());

        setB.retainAll(setC);
        System.out.println("B & C: " + setB);
    }
}
