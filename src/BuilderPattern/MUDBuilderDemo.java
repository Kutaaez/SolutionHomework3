package BuilderPattern;

import Entity.NPC;
import Entity.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        // creating builder class
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        builder.setDungeonName("The Dark Cave");
             //adding room;
        builder.addRoom(new Room("Entrance", "A dark and damp entrance."));
        builder.addRoom(new Room("Treasure Chamber", "Glowing with gold and gems."));
        builder.addRoom(new Room("Monster Lair", "A chilling cave where monsters dwell."));
                //adding npcs;
        builder.addNPC(new NPC("Goblin", "A small but dangerous creature.", 50));
        builder.addNPC(new NPC("Dragon", "A mighty beast guarding the treasure!", 500));
                //adding traps;
        builder.getRoom(0).
                addTrap("Spike floor");
        builder.getRoom(1).
                addTrap("Arrow trap");
        //creating dungeon;
        Dungeon dungeon = builder.build();

        System.out.println("builded dungeon:");
        System.out.println(dungeon);
    }}
