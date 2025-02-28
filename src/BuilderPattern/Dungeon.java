package BuilderPattern;

import Entity.NPC;
import Entity.Room;

import java.util.List;

public class Dungeon {
    private String dungeonName;
    private List<Room> dungeonRooms;
    private List<NPC> dunegonNPCs;

    public Dungeon(String dungeonName, List<Room> dungeonRooms, List<NPC> dunegonNPCs) {
        this.dungeonName = dungeonName;
        this.dungeonRooms = dungeonRooms;
        this.dunegonNPCs = dunegonNPCs;
    }

    public String getDungeonName() {
        return dungeonName;
    }

    public void setDungeonName(String dungeonName) {
        this.dungeonName = dungeonName;
    }

    public List<Room> getDungeonRooms() {
        return dungeonRooms;
    }

    public void setDungeonRooms(List<Room> dungeonRooms) {
        this.dungeonRooms = dungeonRooms;
    }

    public List<NPC> getDunegonNPCs() {
        return dunegonNPCs;
    }

    public void setDunegonNPCs(List<NPC> dunegonNPCs) {
        this.dunegonNPCs = dunegonNPCs;
    }
}
