package demo;

import Entity.NPC;
import Entity.Room;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room room = new Room("Entrance", "A dark and damp entrance.");
        NPC npc =  new NPC("Goblin", "A small but dangerous creature.", 50);
        NPC npcClone = npc.cloneEntity();

        //clonned many time for show how work clone;
        Room roomClone = room.cloneEntity();
        Room roomClone2 = room.cloneEntity();
        Room roomClone3 = room.cloneEntity();
        NPC npcClone2 = npc.cloneEntity();
        NPC npcClone3 = npc.cloneEntity();

        System.out.println("Original:\n"+room+"\n"+npc+"\nClone:\n"+roomClone+"\n"+npcClone);
        //for example I change props in clone class
        npcClone.setNpcName("Zombie");
        npcClone.setNpcDescription("BRAAAAAAIN!");
        npcClone.setNpcHealth(10);
        //room clone change props:
        roomClone.setRoomName("Grave");
        roomClone.setRoomDescription("this too many zombies...");
        System.out.println("Original:\n"+room+"\n"+npc+"\nClone:\n"+roomClone+"\n"+npcClone+"\n"+roomClone2+"\n"+roomClone3+"\n"+npcClone2+"\n"+npcClone3);
    }
}
