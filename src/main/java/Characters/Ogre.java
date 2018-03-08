package Characters;

public class Ogre extends Enemy {

    public Ogre(String type, int health) {
        super(type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
