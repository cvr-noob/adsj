@FunctionalInterface
interface Lambda {
  double getPi();
}

public class PiLambda {
    public static void main(String[] args) {
      Lambda x = () -> 3.14;
      System.out.println(x.getPi());
  }
}
