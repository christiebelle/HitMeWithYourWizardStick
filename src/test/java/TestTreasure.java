import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTreasure {

    private Gold gold;

    @Before
    public void setUp() throws Exception {
        gold = new Gold("Gold");
    }

    @Test
    public void testCanGetTreasure() {
        assertEquals("Gold", gold.getType());
    }
}
