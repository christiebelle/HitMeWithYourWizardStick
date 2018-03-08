package Characters;

public class Orc extends Enemy {

    public Orc(String type, int health) {
        super(type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
