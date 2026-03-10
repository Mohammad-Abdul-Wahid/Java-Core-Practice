public class FibonacciSeries {
  public static void main(String[] args) {
    // Generate Fibonacci series up to N terms.
    int a = 0, b = 1, c = 0, n = 7;
    System.out.println(a);
    System.out.println(b);
    for (int i = 1; i < n; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.println(c);
    }
  }

}
