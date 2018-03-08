package Rooms;

import Characters.Enemy;
import Treasures.Treasure;

public class Room {

    String roomname;
    int roonnum;
    Enemy enemy;
    Treasure treasure;

    public Room(String roomname, int roonnum, Enemy enemy, Treasure treasure) {
        this.roomname = roomname;
        this.roonnum = roonnum;
        this.enemy = enemy;
        this.treasure = treasure;
    }

    public String getRoomname() {
        return roomname;
    }

    public int getRoonnum() {
        return roonnum;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Treasure getTreasure() {
        return treasure;
    }
}
