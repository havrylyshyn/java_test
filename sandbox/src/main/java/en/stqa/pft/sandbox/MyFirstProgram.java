package en.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Vasia");
        hello("Petia");
        double a = 5;
        double b = 4;
        System.out.println("Quadrate square with edge " + a + " = " + area(a));
        System.out.println("Rectangle square with edges " + a + " & " + b + " = " + area(a, b));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(double a) {
        return a*a;
    }
    public static double area(double a, double b) {
        return a*b;
    }
}