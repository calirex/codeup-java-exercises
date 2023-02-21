package media;

import media.Media;

import java.util.Date;

public class Cds extends Media {

    @Override
    public void deviceNeeded() {
        System.out.println("If you have a CD");
    }

    @Override
    public void materialMadeOf() {
        System.out.println("Cd's made from the good stuff");
    }

    @Override
    public void demolish() {
        System.out.println("Destroy");
    }

    public Cds(boolean isAdultOnly, String name) {
        Media.adultOnly = adultOnly;
        Media.name = name;
        Media.checkedOut = false;
    }

    @Override
    public String identify() {
        return name;
    }

    @Override
    public Date getLastScan() {
        return lastScan;
    }

    @Override
    public void setLastScan(Date date) {
        lastScan = date;

    }
}
