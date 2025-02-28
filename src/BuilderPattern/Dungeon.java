package BuilderPattern;

import Entity.NPC;
import Entity.Room;

import java.util.List;

public class Dungeon {
    private String dungeonName;
    private List<Room> dungeonRooms;
    private List<NPC> dungeonNPCs;

    public Dungeon(String dungeonName, List<Room> dungeonRooms, List<NPC> dunegonNPCs) {
        this.dungeonName = dungeonName;
        this.dungeonRooms = dungeonRooms;
        this.dungeonNPCs = dunegonNPCs;
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

    public List<NPC> getDungeonNPCs() {
        return dungeonNPCs;
    }

    public void setDungeonNPCs(List<NPC> dunegonNPCs) {
        this.dungeonNPCs = dunegonNPCs;
    }

    @Override
    public String toString() {
        String result = "Dungeon: " + dungeonName;
        result+= "\nRooms in the dungeon:\n";
            for (int i = 0; i < dungeonRooms.size(); i++) {
                result+=(i+1) +". " + dungeonRooms.get(i) + "\n";
            }
            result+="\nNPCs in the dungeon:\n";
            for (int i = 0; i < dungeonNPCs.size(); i++) {
                result+=(i+1) +". " + dungeonNPCs.get(i) + "\n";
            }
        return result;
    }
}
