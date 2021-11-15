package assignment4;

import java.util.ArrayList;

public class Apartment {
    private ArrayList<Room> rooms;
    private final Room entrance;

    Apartment(){
        this.entrance = new Room("Hallway");
        rooms.add(this.entrance);
    }

    public Room enter(){
        return this.entrance.enter();
    }
    public void extension(Room newRoom){
        if (newRoom == null){
            return;
        }
        this.rooms.add(new Room(newRoom.getName()));
    }
}
