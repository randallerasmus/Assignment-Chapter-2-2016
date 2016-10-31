package Chapter2assignment.Failing;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

/**
 * Created by User on 2016/10/25.
 */
public class FailingTest extends TestCase {

    private Failing fail;

    private String name;

    @Before
    public void setUp() throws Exception
    {
        name = "Braedy";
    }

    @After
    public void tearDown() throws Exception{
        fail = null;
    }



    /*

    Test fails purposefully, commented out to ensure that all tests will run. remove this message and the comment
    to test if the method fails successfully.

    @Test
    public void testGetName() throws Exception{
        fail = new Failing(name);

        //purposefully failing test
        assertEquals("Bob", fail.getName());
    }
    */
}
