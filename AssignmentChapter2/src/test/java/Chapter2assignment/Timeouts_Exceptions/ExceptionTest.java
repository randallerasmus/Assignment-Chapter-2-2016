package Chapter2assignment.Timeouts_Exceptions;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class ExceptionTest extends TestCase {

    private Exceptions exceptions;

    private boolean value;

    @Before
    public void setUp() throws Exception
    {
        value = false;
    }

    @After
    public void tearDown() throws Exception
    {
        exceptions = null;
    }

    @Test(expected = Exception.class)
    public void testExceptions()
    {
        exceptions = new Exceptions(value);
        assertFalse(exceptions.isValue());
    }
}
