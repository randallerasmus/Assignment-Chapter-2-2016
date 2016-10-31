package Chapter2assignment.NonNullness;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class NonNullnessTest extends TestCase {

    private NonNullness nonNull;

    private String name;
    private String surname;

    @Before
    public void setUp() throws Exception
    {
        name = "Randall";
        surname = "Erasmus";
    }

    @Test
    public void testName() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertEquals(name, nonNull.getName());
    }

    @Test
    public void testSurname() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertEquals(surname, nonNull.getSurname());
    }

    @Test
    public void testNonNullness() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertNotNull(nonNull);
    }

    @After
    public void tearDown() throws Exception
    {
        nonNull = null;
    }


}
