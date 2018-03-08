import Characters.Barbarian;
import Characters.Enemy;
import Characters.Orc;
import Characters.Player;
import Rooms.Room;
import Rooms.RoomNames;
import Treasures.Treasure;
import org.junit.Before;

public class TestGame {

    Player player;
    Room room;
    Treasure gold;
    Enemy orc;

    Game game;


    @Before
    public void setUp() throws Exception {
        gold = new Gold("Gold");
        orc = new Orc("Orc", 100);
        room = new Room(RoomNames.ROOMOFFAILEDCODINGDREAMS.getRoomName(), RoomNames.ROOMOFFAILEDCODINGDREAMS.getRoomNumber(), orc, gold);
        player = new Barbarian("Hannibal", "Barbarian", 100, 2);

        game = new Game();
    }
}
