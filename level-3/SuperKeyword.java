class Animal{
  public Animal(){
    System.out.println("Inside Animal class constructor");
  }
}
class Dog extends Animal{
  public Dog(){
    super();
    System.out.println("Inside dog class constructor");
  }
}

class BullDog extends Dog{
  public BullDog(){
    super();
    System.out.println("Inside BullDog class constructor");
  }
}


public class SuperKeyword {

  public static void main(String[] args) {
    BullDog bd=new BullDog();
  }

  }


