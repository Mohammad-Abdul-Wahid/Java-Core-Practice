public class GCDandLCM {
  public static void main(String[] args) {
    // Find GCD and LCM of two numbers.
    int a = 210, b = 120, gcd = 1;
    int m = a, n = b;
    // GCD
    while (a > 0) {
      if (b % a == 0) {
        gcd = a;
        break;
      }
      int temp = a;
      a = b % a;
      b = temp;
    }
    System.out.println(gcd);

    // LCM
    System.out.println(m * n / gcd);
  }
}
