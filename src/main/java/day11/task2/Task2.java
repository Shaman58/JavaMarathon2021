package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Palladin palladin = new Palladin();
        Shaman shaman = new Shaman();
        Magician magician = new Magician();

        warrior.physicalAttack(palladin);
        System.out.println(palladin.toString());
        palladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(palladin);
        System.out.println(palladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        palladin.healHimself();
        System.out.println(palladin.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
        warrior.physicalAttack(magician);
        System.out.println(magician.toString());
    }
}
