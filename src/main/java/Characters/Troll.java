package Characters;

public class Troll extends Enemy {

    public Troll(String type, int health) {
        super(type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
