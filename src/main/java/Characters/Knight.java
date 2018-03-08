package Characters;

import Interfaces.iAttack;

public class Knight extends Player implements iAttack {

    public Knight(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
