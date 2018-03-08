package Characters;

import Interfaces.iAttack;

public class Wizard extends Player implements iAttack {

    public Wizard(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
