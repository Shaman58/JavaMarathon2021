package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int physDef = 0;
    private int magicDef = 80;
    private int physAtt = 5;
    private int magicAtt = 20;

    public Magician() {
        super.setMagicDef(this.magicDef);
        super.setPhysDef(this.physDef);
        super.setPhysAtt(this.physAtt);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - magicAtt * (100 - hero.getMagicDef()) / 100);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }

}
