package Entity;

public class NPC implements CloneableGameEntity
{
    private String npcName;
    private String npcDescription;
    private int npcHealth;

    public NPC(String npcName, String npcDescription, int npcHealth) {
        this.npcName = npcName;
        this.npcDescription = npcDescription;
        this.npcHealth = npcHealth;
    }

    @Override
    public String toString() {
        return npcName + ":\nHP:" + npcHealth + "\n" + npcDescription;

    }

    public String getNpcName() {
        return npcName;
    }

    public String getNpcDescription() {
        return npcDescription;
    }

    public int getNpcHealth() {
        return npcHealth;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public void setNpcDescription(String npcDescription) {
        this.npcDescription = npcDescription;
    }

    public void setNpcHealth(int npcHealth) {
        this.npcHealth = npcHealth;
    }

    @Override
    public NPC cloneEntity() {

        return new NPC(this.npcName,this.npcDescription,this.getNpcHealth());
    }
}
