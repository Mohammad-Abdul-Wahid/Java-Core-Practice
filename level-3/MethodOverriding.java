
class Animal {
  public void sound() {
    System.out.println("Animal makes sound.");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog makes a sound bow!");
  }
}

class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Cat makes a sound meow!");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    Cat c=new Cat();
    c.sound();
  }
}