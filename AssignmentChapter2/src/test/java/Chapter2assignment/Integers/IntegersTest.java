package Chapter2assignment.Integers;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class IntegersTest extends TestCase {

    private Integers integers;

    private int value;

    @Before
    public void setUp() throws Exception
    {
        value = 100;
    }

    @Test
    public void testValue() throws Exception
    {
        integers = new Integers(value);
        assertEquals(value, integers.getValue());
    }

    @After
    public void tearDown() throws Exception
    {
        integers = null;
    }


}
