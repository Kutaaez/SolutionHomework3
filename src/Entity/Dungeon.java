package Entity;

import prototype.CloneableGameEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dungeon implements CloneableGameEntity {
    private String dungeonName;
    private List<Room> dungeonRooms;
    private List<NPC> dungeonNPCs;
    private static Map<String, Integer> cloneCounter = new HashMap<>();

    public Dungeon() {
        this.dungeonRooms = new ArrayList<>();
        this.dungeonNPCs = new ArrayList<>();
    }

    public Dungeon(String dungeonName, List<Room> dungeonRooms, List<NPC> dunegonNPCs) {
        this.dungeonName = dungeonName;
        this.dungeonRooms = dungeonRooms;
        this.dungeonNPCs = dunegonNPCs;
    }

    public String getDungeonName() {
        return dungeonName;
    }

    public Dungeon setDungeonName(String dungeonName) {
        this.dungeonName = dungeonName;
        return this;
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
        String result = "+ + + Dungeon: " + dungeonName;
        result+= " + + + \n- - - Rooms in the dungeon: - - - \n";
            for (int i = 0; i < dungeonRooms.size(); i++) {
                result+=(i+1) +". " + dungeonRooms.get(i) + "\n";
            }
            result+="\n- - - NPCs in the dungeon: - - - \n";
            for (int i = 0; i < dungeonNPCs.size(); i++) {
                result+=(i+1) +". " + dungeonNPCs.get(i) + "\n";
            }

        return result;
    }
    public void addRoom(Room room) {
        dungeonRooms.add(room);
    }
    public Dungeon removeRoomByIndex(int index) {
        dungeonRooms.remove(index);
        return this ;
    }
    public void addNPC(NPC npc) {
        dungeonNPCs.add(npc);
    }
    public void removeNPCByIndex(int index) {
        dungeonNPCs.remove(index);
    }

    @Override
    public Dungeon cloneEntity() {
        cloneCounter.put(dungeonName, cloneCounter.getOrDefault(dungeonName, 0) + 1);
        int cloneNumber = cloneCounter.get(this.dungeonName);
        Dungeon clonnedDungeon = new Dungeon();
        clonnedDungeon.setDungeonName(this.dungeonName + (" Clone #") + cloneNumber) ;
        for (NPC npc: this.dungeonNPCs) {
            clonnedDungeon.addNPC(npc);
        }
        for(Room room : this.dungeonRooms){
            clonnedDungeon.addRoom(room);
        }
        return clonnedDungeon;
    }
}
