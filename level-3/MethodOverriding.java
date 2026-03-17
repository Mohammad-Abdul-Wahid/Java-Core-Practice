
class Animal {
  public void sound() {
    System.out.println("Animal makes sound.");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog barks");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {

  }
}