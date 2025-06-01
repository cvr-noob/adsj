public class Person {
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
