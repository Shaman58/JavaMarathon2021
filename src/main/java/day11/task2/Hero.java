package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health = 100;
    private final int MAXHEALTH = 100;
    private int magicDef, physDef, physAtt;

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

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setHealth(int health) {
        if (health < 0)
            this.health = 0;
        else this.health = Math.min(health, MAXHEALTH);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - physAtt * (100 - hero.getPhysDef()) / 100);
    }
}
