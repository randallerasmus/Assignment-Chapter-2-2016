package Chapter2assignment.FloatingPoint;

/**
 * Created by User on 2016/10/25.
 */

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FloatingPointTest extends TestCase {

    private FloatingPoint floatingPoint;

    private double value;

    @Before
    public void setUp() throws Exception
    {
        value = 2.5;
    }

    @Test
    public void testValue() throws Exception
    {
        floatingPoint = new FloatingPoint(value);
        assertEquals(value, floatingPoint.getValue());
    }
    @After
    public void tearDown() throws Exception{
        floatingPoint = null;
    }
}
