package Chapter2assignment.ObjectEquality;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2016/10/25.
 */
public class ObjectEqualityTest extends TestCase {

    private ObjectEquality objectEquality1;
    private ObjectEquality objectEquality2;

    private String name;
    private String surname;
    private int age;

    @Before
    public void setUp() throws Exception {

        name = "Randall";
        surname = "Erasmus";
        age = 32;
    }

    @After
    public void tearDown() throws Exception
    {
        objectEquality1 = null;
        objectEquality2 = null;
    }

    @Test
    public void testObjectEquality() throws Exception{
        objectEquality1 = new ObjectEquality(name, surname, age);
        objectEquality2 = objectEquality1;

        assertSame(objectEquality1, objectEquality2);
    }
}
