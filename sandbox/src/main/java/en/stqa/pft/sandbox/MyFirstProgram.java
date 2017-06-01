package en.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Vasia");
        hello("Petia");

        Square s = new Square(5);
        System.out.println("Quadrate square with edge " + s.a + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle square with edges " + r.a + " & " + r.b + " = " + r.area());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 5);
        System.out.println("Distance between p1(" + p1.x + ";" + p1.y + ") and p2(" + p2.x + ";" + p2.y + ") = " + p2.distance(p1, p2));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

//    public static double distance(Point p1, Point p2) {
//        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
//    }

}