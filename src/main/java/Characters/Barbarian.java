package Characters;

import Enums.Weapons;
import Interfaces.iAttack;

public class Barbarian extends Player implements iAttack {

    public Barbarian(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        enemy.deductHealth(player.getWeapon().getDamage());
        return player.getName() + " " + player.getWeapon().getAttack() + " the " + enemy.getType() + " with their " + player.getWeapon().toString().toLowerCase() + " inflicting a damage of " + player.getWeapon().getDamage();
    }
}
