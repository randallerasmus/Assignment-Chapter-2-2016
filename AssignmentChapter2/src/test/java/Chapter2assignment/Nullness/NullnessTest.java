package Chapter2assignment.Nullness;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class NullnessTest extends TestCase{

    //will not be set to anything to ensure it stays null
    private Nullness nullness;


    @Before
    public void setUp() throws Exception{
    }


    //test illustrates the use of the assertNull() method.
    @Test
    public void testValue() throws Exception
    {
        assertNull(nullness);
    }
}
