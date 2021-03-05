package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("Metallica", 1981));
        bands.add(new MusicBand("Rammstein", 1994));
        bands.add(new MusicBand("All The Cold", 2006));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("AC/DC", 1973));
        bands.add(new MusicBand("Pink Floyd", 1965));
        bands.add(new MusicBand("Orbit Culture", 2013));
        bands.add(new MusicBand("Arch Enemy", 1996));
        bands.add(new MusicBand("Children of Bodom", 1993));
        bands.add(new MusicBand("Walknut", 2005));

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bands2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000)
                bands2000.add(band);
        }
        return bands2000;
    }
}
