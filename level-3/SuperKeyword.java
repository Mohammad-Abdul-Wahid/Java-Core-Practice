public class SuperKeyword {

  public SuperKeyword(){
    System.out.println("Inside default constructor");
  }

  public SuperKeyword(int a){
    super();
    System.out.println("Inside parametrized constructor");
  }

  public static void main(String[] args) {
    SuperKeyword sk=new SuperKeyword(1);
  }

  }


