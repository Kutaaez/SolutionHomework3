package BuilderPattern;

import Entity.NPC;
import Entity.Room;

import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public SimpleDungeonBuilder(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    @Override
    public void setDungeon(String name) {
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

    @Override
    public Dungeon build() {
        return new Dungeon(name,rooms,npcs);
    }
}
