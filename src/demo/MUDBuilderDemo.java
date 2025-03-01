package demo;

import BuilderPattern.SimpleDungeonBuilder;
import Entity.Dungeon;
import Entity.NPC;
import Entity.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
        .setDungeonName("The Dark Cave")
        .addRoom(new Room("Treasure Chamber", "Glowing with gold and gems."))
        .addRoom(new Room("Monster Lair", "A chilling cave where monsters dwell."))
        .addNPC(new NPC("Goblin", "A small but dangerous creature.", 50))
        .addNPC(new NPC("Dragon", "A mighty beast guarding the treasure!", 500))
        .addTrapToRoom(0,"Spike floor")
        .build();


        System.out.println("builded dungeon:");
        System.out.println(dungeon);
    }}
