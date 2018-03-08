package Characters;

import Interfaces.iAttack;

public class Barbarian extends Player implements iAttack {

    public Barbarian(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
