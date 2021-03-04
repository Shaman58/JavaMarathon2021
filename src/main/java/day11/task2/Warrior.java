package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physDef = 80;
    private int magicDef = 0;
    private int physAtt = 30;

    public Warrior() {
        super.setMagicDef(this.magicDef);
        super.setPhysDef(this.physDef);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - physAtt * (100 - hero.getPhysDef()) / 100);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
