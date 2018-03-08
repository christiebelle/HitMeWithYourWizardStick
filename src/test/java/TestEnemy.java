import Characters.Knight;
import Characters.Ogre;
import Characters.Orc;
import Characters.Troll;
import Enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnemy {

    Orc orc;
    Ogre ogre;
    Troll troll;

    Knight knight;

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

    @Test
    public void testDeductHealth() {
        troll.deductHealth(10);
        assertEquals(90, troll.getHealth());
    }

    @Test
    public void testCalculateActualDamage() {
        orc.setLevel(2);
        orc.setWeapon(Weapons.AXE);
        assertEquals(16, orc.calculateActualDamage());
    }

    @Test
    public void testAttack() {
        knight = new Knight("Brave Sir Robin", "Knight", 100);
        orc.setLevel(2);
        orc.setWeapon(Weapons.SWORD);
        assertEquals("Orc slashes Brave Sir Robin with their sword inflicting a damage of 20", orc.attack(knight, orc));
    }
}

