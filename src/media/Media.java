package media;

import java.util.Date;

abstract public class Media implements LibraryUtils{

    protected static boolean adultOnly;
    protected static String name;

    protected static boolean checkedOut = false;

    protected static Date lastScan;


    // METHODS //

    // CAN BE DONE TO EVERY FORM OF MEDIA //
    public static void checkedOut() {
        if (checkedOut) {
            System.out.println("checked out");
        } else {
            System.out.println("Is available for checkout");
        }
    }

    public static boolean isAdultOnly() {
        return adultOnly;
    }

    public static void changeAdultOnly() {
        adultOnly = !adultOnly;
    }


    // NEEDS TO BE DECLARED FOR EVERY FORM OF MEDIA EXTENDED FROM THIS CLASS //

    abstract public void deviceNeeded();

    abstract public void materialMadeOf();

    abstract public void demolish();

}

