public class SwapTwoNumber {
  public static void main(String[] args) {
    // Swap two numbers:
    // using third variable
    int a=5,b=4;
    System.out.println(a +" " +b);
    int c=a;
    a=b;
    b=c;
    System.out.println(a +" " +b);

    // without using third variable
    System.out.println(a + " " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println(a + " " + b);

  }
  
}
