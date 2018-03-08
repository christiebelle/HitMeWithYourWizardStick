import Characters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Knight knight;
    Barbarian barbarian;
    Cleric cleric;
    Dwarf dwarf;
    Warlock warlock;
    Wizard wizard;


    @Before
    public void setUp() throws Exception {
        knight = new Knight("Brave Sir Robin", "Knight", 100);
    }

    @Test
    public void testHasName() {
        assertEquals("Brave Sir Robin", knight.getName());
    }

    @Test
    public void testHasType() {
        assertEquals("Knight", knight.getType());
    }

    @Test
    public void testHasHealth() {
        assertEquals(100, knight.getHealth());
    }
}
