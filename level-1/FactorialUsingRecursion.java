public class FactorialUsingRecursion {
  public static void main(String[] args) {
    factorial(5);
  }

  // Find factorial of a number using recursion
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
