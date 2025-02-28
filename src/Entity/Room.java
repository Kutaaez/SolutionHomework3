package Entity;

import java.util.ArrayList;
import java.util.List;

public class Room implements CloneableGameEntity{
    private String roomName;
    private String roomDescription;
    private List<String> traps;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.traps = new ArrayList<>();

    }
    public void addTrap(String trap) {
        traps.add(trap);
    }


    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @Override
    public String toString() {

        String result =  roomName + "\n" + roomDescription + (traps.isEmpty() ? "\nThere is not trap in the room.\n":
        "\nTraps in the room, be carefull!:\n");
        if(traps.isEmpty()){

        }else {
        for (int i = 0; i < traps.size(); i++) {
            result+="***" + traps.get(i);
        }}
        return result;
    }

    @Override
    public Room cloneEntity() {
        Room clonedRoom = new Room(this.roomName + " (Clone)", this.roomDescription);
        clonedRoom.traps = new ArrayList<>(this.traps);
        return clonedRoom;
    }
}
