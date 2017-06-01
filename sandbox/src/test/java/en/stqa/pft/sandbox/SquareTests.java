package en.stqa.pft.sandbox;

import en.stqa.pft.sandbox.Square;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Bohdan.Havrylyshyn on 31.05.2017.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);

        Rectangle r = new Rectangle(4, 5);
        Assert.assertEquals(r.area(), 20.0);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 5);
        Assert.assertEquals(p1.distance(p1, p2), 5.0);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(0, 3);
        Assert.assertEquals(p1.distance(p3, p4), 3.0);
    }
}
