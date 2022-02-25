import com.danielfan.module1._4.Circle;
import com.danielfan.module1._4.Colour;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    /**
     * Test getArea()
     * Partitioned the input as follows:
     * radius -> positive
     * radius -> negative
     * radius -> 0
     * radius -> -1
     * radius -> 1
     */

    @Test public void testpositive() {
        assertEquals(78.53981633974483, new Circle(5, Colour.RED).getArea(), 0);
    }

    @Test public void testnegative() {
        assertEquals(78.53981633974483, new Circle(-5, Colour.RED).getArea(), 0);
    }

    @Test public void testzero() {
        assertEquals(0, new Circle(0, Colour.RED).getArea(), 0);
    }

    @Test public void testnegative1() {
        assertEquals(3.141592653589793, new Circle(-1, Colour.RED).getArea(), 0);
    }

    @Test public void testpositive1() {
        assertEquals(3.141592653589793, new Circle(1, Colour.RED).getArea(), 0);
    }
}