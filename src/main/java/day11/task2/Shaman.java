package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int physDef = 20;
    private int magicDef = 20;
    private int physAtt = 10;
    private int magicAtt = 15;
    private int healHimself = 50;
    private int healTeammate = 30;

    public Shaman() {
        super.setMagicDef(this.magicDef);
        super.setPhysDef(this.physDef);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - magicAtt * (100 - hero.getMagicDef()) / 100);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - physAtt * (100 - hero.getPhysDef()) / 100);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
