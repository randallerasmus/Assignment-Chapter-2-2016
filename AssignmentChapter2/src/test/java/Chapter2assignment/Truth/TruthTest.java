package Chapter2assignment.Truth;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class TruthTest extends TestCase {
    private Truth truth;

    private boolean value;

    @Before
    public void setUp() throws Exception
    {
        value = true;
    }

    @Test
    public void testValue() throws Exception
    {
        truth = new Truth(value);
        assertTrue(truth.isValue());
    }
    @After
    public void tearDown() throws Exception{
        truth = null;
    }
}
