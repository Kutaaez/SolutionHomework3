package demo;

import Entity.Dungeon;
import BuilderPattern.SimpleDungeonBuilder;
import Entity.NPC;
import Entity.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room EntranceOrig = new Room("Entrance", "A dark and damp entrance.");
        NPC GoblinOrig =  new NPC("Goblin", "A small but dangerous creature.", 50);

        Room Hallway = new Room("Hallway", "A long, narrow corridor with flickering torches.");
        NPC SkeletonWarrior = new NPC("Skeleton Warrior", "An undead soldier wielding a rusted sword.", 70);

        Room TreasureChamber = new Room("Treasure Chamber", "A glittering room filled with gold and artifacts.");
        NPC DragonHatchling = new NPC("Dragon Hatchling", "A small but fiery dragonling, guarding the treasure.", 100);

        Room PrisonCell = new Room("Prison Cell", "A cold, damp cell with chains hanging from the walls.");
        NPC CaptiveKnight = new NPC("Captive Knight", "A weary knight, locked away and weakened.", 40);
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("The Dark Cave")
                .addNPC(GoblinOrig)
                .addRoom(EntranceOrig)
                .addRoom(Hallway)
                .addNPC(SkeletonWarrior)
                .addRoom(TreasureChamber)
                .addNPC(DragonHatchling)
                .addRoom(PrisonCell)
                .addNPC(CaptiveKnight)
                .addCloneRoom(Hallway)
                .addCloneRoom(Hallway)
                .addCloneRoom(Hallway)
                .addCloneRoom(Hallway)
                .addCloneRoom(TreasureChamber)
                .addCloneRoom(EntranceOrig)
                .addCloneRoom(EntranceOrig)
                .addCloneNPC(DragonHatchling)
                .addCloneNPC(DragonHatchling)
                .addCloneNPC(GoblinOrig)
                .addTrapToRoom(0, "Spike floor")
                .addTrapToRoom(1, "Arrow trap")
                .addTrapToRoom(3, "Falling boulder")
                .addTrapToRoom(4, "Flame jets")
                .addTrapToRoom(5, "Swinging blades")
                .addTrapToRoom(6, "Pitfall trap")
                .addTrapToRoom(7, "Poison darts")
                .addTrapToRoom(3, "Spike floor")
                .addTrapToRoom(7, "Arrow trap")
                .addTrapToRoom(5, "Swinging blades")
                .addTrapToRoom(2, "Collapsing ceiling")
                .addTrapToRoom(4, "Electric shock floor")
                .build();
        Dungeon dungeon1 = dungeon.cloneEntity();
        Dungeon dungeon2 = dungeon.cloneEntity()
                .setDungeonName("Clone").removeRoomByIndex(1); //в моменте поменять их

        System.out.println(dungeon);
        System.out.println(dungeon1);
        System.out.println(dungeon2);

    }
}
