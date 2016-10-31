package Chapter2assignment.False;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class FalseTest extends TestCase{
    private False falseObject;

    private boolean value;

    @Before
    public void setUp() throws Exception
    {
        value = false;
    }

    @Test
    public void testValue() throws Exception
    {
        falseObject = new False(value);
        assertFalse(falseObject.isValue());
    }
    @After
    public void tearDown() throws Exception{
        falseObject = null;
    }
}
