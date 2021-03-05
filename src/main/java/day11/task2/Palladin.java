package day11.task2;

public class Palladin extends Hero implements PhysAttack, Healer {
    private int physAtt = 15;
    private int physDef = 50;
    private int magicDef = 20;
    private int healHimself = 25;
    private int healTeammate = 10;

    public Palladin() {
        super.setMagicDef(this.magicDef);
        super.setPhysDef(this.physDef);
        super.setPhysAtt(this.physAtt);
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
        return "Palladin{" +
                "health=" + getHealth() +
                '}';
    }
}
