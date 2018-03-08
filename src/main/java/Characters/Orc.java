package Characters;

public class Orc extends Enemy {

    public Orc(String type, int health) {
        super(type, health);
    }

    @Override
    public String attack(Player player, Enemy enemy) {
        if (player.getType() == "Knight") {
            Knight knight = (Knight) player;
            int power = enemy.calculateActualDamage() - knight.getArmour();
            player.deductHealth(power);
            return enemy.getType() + " " + enemy.getWeapon().getAttack() + " " + player.getName() + " with their " + enemy.getWeapon().toString().toLowerCase() + " inflicting a damage of " + power;
        }else{
            int power = enemy.calculateActualDamage();
            player.deductHealth(power);
            return enemy.getType() + " " + enemy.getWeapon().getAttack() + " " + player.getName() + " with their " + enemy.getWeapon().toString().toLowerCase() + " inflicting a damage of " + power;
        }
    }
}
