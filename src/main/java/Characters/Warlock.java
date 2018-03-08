package Characters;

import Interfaces.iAttack;

public class Warlock extends Player implements iAttack {

    public Warlock(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
