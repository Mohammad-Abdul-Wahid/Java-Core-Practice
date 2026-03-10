public class ReverseNumber {
  public static void main(String[] args) {
    // Reverse a number
    int n = 452, ans = 0;
    while (n > 0) {
      int r = n % 10;
      n = n / 10;
      ans = (ans * 10) + r;
    }
    System.out.println(ans);
  }
}
