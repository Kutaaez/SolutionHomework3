package BuilderPattern;

import Entity.NPC;
import Entity.Room;

public interface IDungeonBuilder {

    public void setDungeon(String name);
    public void addRoom(Room room);
    public void addNPC(NPC npc);
    public Dungeon build();
}

