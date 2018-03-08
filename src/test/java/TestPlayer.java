import Characters.Ogre;
import Characters.Orc;
import Characters.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {
    @Before
    public void setUp() throws Exception {
        orc = new Orc("Orc", 100);
        ogre = new Ogre("Ogre", 100);
        troll = new Troll("Troll", 100);
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
