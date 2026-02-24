public class CountDigits {
  public static void main(String[] args) {
    // Count digits in a number.
    int n = 5152, c = 0;
    while (n > 0) {
      n /= 10;
      c++;
    }
    System.out.println("Count: " + c);
  }

}
