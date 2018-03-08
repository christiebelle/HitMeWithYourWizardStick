package Characters;

import Enums.Weapons;

public abstract class Player {

    private String name;
    private String type;
    private int health;
    private int attackBonus;
    private Weapons weapon;

    public Player(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attackBonus = attackBonus;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
