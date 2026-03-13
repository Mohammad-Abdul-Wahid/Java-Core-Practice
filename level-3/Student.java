
public class Student {
  String name;
  int roll_number;
  int age;

  public Student(String name, int roll_number, int age) {
    this.name = name;
    this.roll_number = roll_number;
    this.age = age;
  }

  public String getName(String name) {
    return this.name;
  }

  public int getRollNumber(String name) {
    return this.roll_number;
  }

  public int getAge(String name) {
    return this.age;
  }

  public void settName(String name) {
    this.name = name;
  }

  public void setRollNumber(int roll_number) {
    this.roll_number = roll_number;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {

  }
}
