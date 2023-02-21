package media;

import media.Media;

public class Cds extends Media {

    @Override
    public void deviceNeeded() {
        System.out.println("If you have a CD");
    }

    @Override
    public void materialMadeOf() {
        System.out.println("Cd's made from the good stuff");
    }

}
