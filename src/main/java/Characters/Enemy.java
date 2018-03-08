package Characters;

import Enums.Weapons;

public abstract class Enemy {

    private String type;
    private int health;
    private int attackBonus;
    private Weapons weapon;

    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
        this.attackBonus = attackBonus;
        this.weapon = weapon;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
