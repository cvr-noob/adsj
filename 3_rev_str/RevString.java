@FunctionalInterface
interface StringReverserLambda {
    String reverse(String string);
}

public class RevString {
    public static void main(String[] args) {
        StringReverserLambda reversingLambda = str -> {
            StringBuilder reversed = new StringBuilder(str).reverse();
            return reversed.toString();
        };

        System.out.println(reversingLambda.reverse("Hello"));
    }
}