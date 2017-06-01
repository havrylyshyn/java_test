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

    }
}
