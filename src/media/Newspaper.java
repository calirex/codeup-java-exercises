package media;

public class Newspaper extends Media {


    @Override
    public void deviceNeeded() {
        System.out.println("Sight");
    }


    @Override
    public void materialMadeOf() {
        System.out.println("Made out of paper");
    }

    @Override
    public void demolish() {
        System.out.println("Destroy");
    }

    // CONSTRUCTORS //
    public Newspaper(boolean adultOnly, String name) {
        Media.adultOnly = adultOnly;
        Media.name = name;
        Media.checkedOut = false;
    }
}
