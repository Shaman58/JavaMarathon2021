package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Metallica", 1981, new ArrayList<>(Arrays.asList(
                new MusicArtist("James Hetfield", 1963),
                new MusicArtist("Lars Ulrich",1963),
                new MusicArtist("Kirk Hammett",1962),
                new MusicArtist("Jason Newsted",1963)
        )));
        MusicBand musicBand2 = new MusicBand("Metallica", 1981, new ArrayList<>(Arrays.asList(
                new MusicArtist("Alex Laiho", 1979),
                new MusicArtist("Janne Virman",1973),
                new MusicArtist("Henka Sepjala",1975),
                new MusicArtist("Jaska Raatikainen",1979),
                new MusicArtist("Alexander Kuoppala",1974)
        )));

        musicBand1.printMembers();
        MusicBand.transferMembers(musicBand2,musicBand1);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
