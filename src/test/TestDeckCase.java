import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by jcanas on 11/12/16.
 */
public class TestDeckCase extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public TestDeckCase() {
        super();
    }
    /**
     * Created by jcanas on 11/12/16.
     */

    @Test
    public void testDeckSize() {
        Deck d = new Deck();
        assertTrue(false);
        assertEquals(52,d.getCards().size());
    }


}