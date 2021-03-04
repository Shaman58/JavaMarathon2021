package day11.task2;

public abstract class Hero {
    private int health = 100;
    private final int maxHealth = 100;
    private int magicDef, physDef;

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0)
            this.health = 0;
        else this.health = Math.min(health, maxHealth);
    }



}
