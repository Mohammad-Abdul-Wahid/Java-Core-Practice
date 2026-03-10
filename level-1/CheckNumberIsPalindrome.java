public class CheckNumberIsPalindrome {
  public static void main(String[] args) {
    // Check if a number is palindrome.
    int n = 101, ans = 0;
    int k = n;
    while (n > 0) {
      int r = n % 10;
      n = n / 10;
      ans = (ans * 10) + r;
    }
    if (k == ans) {
      System.out.println("palindrome");
    } else {
      System.out.println("not palindrome");
    }
  }

}
