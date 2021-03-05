package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name;
    }


    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.members.addAll(musicBand1.members);
        musicBand1.members.clear();
    }

    public void addMember(String member) {
        this.members.add(member);
    }

    public void deleteMember(String member) {
        this.members.remove(member);
    }

    public void printMembers() {
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }
}
