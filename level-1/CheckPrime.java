public class CheckPrime {
  public static void main(String[] args) {
    // check whether a number is prime
    int n = 101;
    int c = 0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
    c = 1;
    break;
    }
    }
    if (c == 0)
    System.out.println("Prime");
    else {
    System.out.println("Not Prime");
    }
  }
  
}
