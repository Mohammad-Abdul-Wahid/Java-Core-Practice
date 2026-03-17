abstract class Shape{
  public abstract void Area();
}

class Rectangle extends Shape{

  @Override
  public void Area() {
    System.out.println("Area: length * breadth");
  }

}

public class Abstraction {
  public static void main(String[] args) {
    
  }
}
