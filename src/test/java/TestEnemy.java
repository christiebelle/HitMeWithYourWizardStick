import Characters.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnemy {

    Orc orc;

    @Before
    public void setUp() throws Exception {
        orc = new Orc("Orc", 100);
    }

    @Test
    public void testHasType() {
        assertEquals("Orc", orc.getType());
    }

    @Test
    public void testHasHealth() {
        assertEquals(100, orc.getHealth());
    }
}

