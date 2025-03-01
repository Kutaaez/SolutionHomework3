package BuilderPattern;

import Entity.Dungeon;
import Entity.NPC;
import Entity.Room;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;
    public SimpleDungeonBuilder() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }
    public SimpleDungeonBuilder addTrapToRoom(int roomIndex, String trap) {
        if (roomIndex >= 0 && roomIndex < rooms.size()) {
            rooms.get(roomIndex).addTrap(trap);
        }
        return this;
    }

    @Override
    public SimpleDungeonBuilder  setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SimpleDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public SimpleDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }
    public SimpleDungeonBuilder addCloneNPC(NPC npc){
        npcs.add(npc.cloneEntity());
        return this;
    }
    public SimpleDungeonBuilder addCloneRoom(Room room){
        rooms.add(room.cloneEntity());
        return  this;
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
        return new Dungeon(name, new ArrayList<>(rooms), new ArrayList<>(npcs));
    }
}
