import Characters.Enemy;
import Characters.Player;
import Rooms.Room;
import Treasures.Treasure;

import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    ArrayList<Room> rooms;

    public Game() {
        this.rooms = new ArrayList<>();
        this.players = new ArrayList<>();
    }


    public void addRoomToGame(Room room) {
        this.rooms.add(room);
    }

    public int noOfRooms() {
        return this.rooms.size();
    }
}

