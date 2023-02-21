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
}
