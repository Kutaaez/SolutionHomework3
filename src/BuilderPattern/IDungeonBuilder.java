package BuilderPattern;

import Entity.Dungeon;
import Entity.NPC;
import Entity.Room;

public interface IDungeonBuilder {

    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}

