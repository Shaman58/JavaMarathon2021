package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("James Hetfield");
        members1.add("Lars Ulrich");
        members1.add("Kirk Hammett");
        members1.add("Jason Newsted");
        MusicBand band1 = new MusicBand("Metallica", 1981,members1);
        List<String> members2 = new ArrayList<>() ;
        members2.add("Alex Laiho");
        members2.add("Janne Virman");
        members2.add("Henka Sepjala");
        members2.add("Jaska Raatikainen");
        members2.add("Alexander Kuoppala");
        MusicBand band2 = new MusicBand("Children of Bodom", 1993,members2);

        MusicBand.transferMembers(band2,band1);
        band1.printMembers();
        band2.printMembers();
    }
}