import BuilderPattern.Dungeon;
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

        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        builder.setDungeonName("The Dark Cave");
        //1 room,npc
        builder.addNPC(GoblinOrig);
        builder.addRoom(EntranceOrig);
        //2 room,npc
        builder.addRoom(Hallway);
        builder.addNPC(SkeletonWarrior);
        //3 room,npc
        builder.addRoom(TreasureChamber);
        builder.addNPC(DragonHatchling);
        //4 room,npc
        builder.addRoom(PrisonCell);
        builder.addNPC(CaptiveKnight);

        //cloning procces:
        builder.addCloneRoom(Hallway);
        builder.addCloneRoom(Hallway);
        builder.addCloneRoom(Hallway);

        builder.addCloneRoom(Hallway);
builder.addCloneRoom(TreasureChamber);
//clonned many times for show how work clone counter;
        builder.addCloneRoom(EntranceOrig);
        builder.addCloneRoom(EntranceOrig);
//clone npc
        builder.addCloneNPC(DragonHatchling);
        builder.addCloneNPC(DragonHatchling);
        builder.addCloneNPC(GoblinOrig);

//adding traps:
        builder.getRoom(0).addTrap("Spike floor");
        builder.getRoom(1).addTrap("Arrow trap");
        builder.getRoom(3).addTrap("Falling boulder");
        builder.getRoom(4).addTrap("Flame jets");
        builder.getRoom(5).addTrap("Swinging blades");
        builder.getRoom(6).addTrap("Pitfall trap");
        builder.getRoom(7).addTrap("Poison darts");
        builder.getRoom(3).addTrap("Spike floor");
        builder.getRoom(7).addTrap("Arrow trap");
        builder.getRoom(5).addTrap("Swinging blades");
        builder.getRoom(2).addTrap("Collapsing ceiling");
        builder.getRoom(4).addTrap("Electric shock floor");
        //changing props for example for random entities
        builder.getRoom(5).setRoomName("The Light cave");
        builder.getNpc(2).setNpcName("Angel");
        //creating Dungeon.

        Dungeon dungeon = builder.build();
        System.out.println(dungeon);

    }
}
