public class SumOfDigits {
  public static void main(String[] args) {
    // Sum of digits of a number.
    int n = 10000, sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    System.out.println(sum);
  }
}
