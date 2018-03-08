package Characters;

import Interfaces.iAttack;

public class Dwarf extends Player{

    public Dwarf(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        return null;
    }
}
