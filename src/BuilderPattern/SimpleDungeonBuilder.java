package BuilderPattern;

import Entity.NPC;
import Entity.Room;
import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    private List<String> traps;

    public SimpleDungeonBuilder() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
        this.traps = new ArrayList<>();
    }

    @Override
    public void setDungeonName(String name) {
        this.name = name;
    }

    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void addNPC(NPC npc) {
        npcs.add(npc);
    }
    public void addCloneNPC(NPC npc){
        npcs.add(npc.cloneEntity());
    }
    public void addCloneRoom(Room room){
        rooms.add(room.cloneEntity());
    }
    public void addTrap(String trapDescription){
        traps.add(trapDescription);
    }
    public Room getRoom(int index) {
        if (index >= 0 && index < rooms.size()) {
            return rooms.get(index);
        }
        return null;
    }
    public NPC getNpc(int index) {
        if (index >= 0 && index < rooms.size()) {
            return npcs.get(index);
        }
        return null;
    }
    public String getName() {
        return name;
    }





    @Override
    public Dungeon build() {
        return new Dungeon(name, new ArrayList<>(rooms), new ArrayList<>(npcs), new ArrayList<>(traps));
    }
}
