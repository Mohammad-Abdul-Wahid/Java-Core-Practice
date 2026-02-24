public class FactorialUsingLoop {
  public static void main(String[] args) {
    // Find factorial of a number using loop
    int fact=1,n=5;
    for(int i=1;i<=n;i++){
    fact*=i;
    }
    System.out.println(fact);
  }
  
}
