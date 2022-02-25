import com.danielfan.module1._4.Triangle;
import com.danielfan.module1._4.Colour;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    /**
     * Test heronsHeight()
     * Partitioned the input as follows:
     * height supplied in constructor: height -> positive
     * height supplied in constructor: height -> negative
     * side1, side2, side3 -> positive
     * side1, side2, side3 -> negative
     * side1 and side2 -> positive side3 -> negative
     * side1 and side3 -> positive side2 -> negative
     * side1 -> negative side2 and side3 -> positive
     * side1 and side2 -> negative side3 -> positive
     * side1 -> positive side2 and side3 -> negative
     * side1 and side3 -> negative side2 -> positive
     * Boundaries: side1 = -1 side2 = 0 side3 = 1
     */
    @Test public void testconstructorpositive(){
        assertEquals(10, new Triangle(5, 10, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void testconstructornegative(){
        assertEquals(-10, new Triangle(5, -10, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void tes123positive(){
        assertEquals(1.8557687223952257, new Triangle(5, 3 ,7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test123negative(){
        assertEquals(-1.8557687223952257, new Triangle(-5, -3 ,-7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test12pos3neg(){
        assertEquals(-1.8557687223952257, new Triangle(5, 3 ,-7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test1pos2neg3pos(){
        assertEquals(1.8557687223952257, new Triangle(5, -3 ,7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test1neg23pos(){
        assertEquals(1.8557687223952257, new Triangle(-5, 3 ,7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test12neg3pos(){
        assertEquals(1.8557687223952257, new Triangle(-5, -3 ,7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test1pos23neg(){
        assertEquals(-1.8557687223952257, new Triangle(5, -3 ,-7, Colour.RED).heronsHeightTest(), 0);
    }
    @Test public void test1neg2pos3neg(){
        assertEquals(-1.8557687223952257, new Triangle(-5, 3 ,-7, Colour.RED).heronsHeightTest(), 0);
    }

    @Test public void testheightboundaries(){
        assertEquals(0, new Triangle(-1, 0, 1, Colour.GREEN).heronsHeightTest(), 0);
    }

    /**
     * Test getArea()
     * Partitioned the input as follows:
     * width and height -> positive
     * width and height -> negative
     * width -> positive height -> negative
     * width -> negative height -> positive
     * Boundaries:
     * width = 0 height = -1
     * width = 1 height = 0
     * width = 0 height = 0
     */

    @Test public void testwhpositive(){
        assertEquals(5, new Triangle(5,2, Colour.RED).getArea(), 0);
    }
    @Test public void testwhnegative(){
        assertEquals(5, new Triangle(-5,-2, Colour.RED).getArea(), 0);
    }
    @Test public void testwpositivehnegative(){
        assertEquals(5, new Triangle(5,-2, Colour.RED).getArea(), 0);
    }
    @Test public void testwnegativehpositive(){
        assertEquals(5, new Triangle(-5,2, Colour.RED).getArea(), 0);
    }
    @Test public void testareaboundaries(){
        assertEquals(0, new Triangle(0,-1, Colour.RED).getArea(), 0);
        assertEquals(0, new Triangle(1,0, Colour.RED).getArea(), 0);
        assertEquals(0, new Triangle(0,0, Colour.RED).getArea(), 0);
    }

}