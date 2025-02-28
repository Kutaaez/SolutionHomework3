import BuilderPattern.Dungeon;
import BuilderPattern.SimpleDungeonBuilder;
import Entity.NPC;
import Entity.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room EntranceOrig = new Room("Entrance", "A dark and damp entrance.");
        NPC GoblinOrig =  new NPC("Goblin", "A small but dangerous creature.", 50);
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        builder.setDungeonName("The Dark Cave");
        builder.addNPC(GoblinOrig);
        builder.addRoom(EntranceOrig);
        builder.addCloneNPC(GoblinOrig);

        builder.addCloneRoom(EntranceOrig);
        builder.getRoom(1).setRoomName("The Light cave");
        builder.getNpc(1).setNpcName("Angel");
        Dungeon dungeon = builder.build();
        System.out.println(dungeon);

    }
}
