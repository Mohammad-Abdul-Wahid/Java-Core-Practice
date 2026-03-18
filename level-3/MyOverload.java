//Method overloading exapmle

class Printer {
    public void print(int a) {
        System.out.println("Inside print1 int");
    }

    public void print(double a) {
        System.out.println("Inside print2 double");
    }

    public void print(String a) {
        System.out.println("Inside print3 String");
    }

    public void print(int a, float b) {
        System.out.println("Inside print4 int & float");
    }

//    public void print(float a, int b) {
//        System.out.println("Inside print4 int & float");
//    }

    public void print(String a, double b) {
        System.out.println("Inside print5 string and double");
    }

    public void print(int a, float b, String c) {
        System.out.println("Inside print6 int,float & string");
    }

    public void print(String a, float b, int c) {
        System.out.println("Inside print7 string,float & double");
    }
}

public class MyOverload {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print(100, 200);

    }
}


