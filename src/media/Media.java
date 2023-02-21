package media;

abstract class Media {
    // METHODS //

    // CAN BE DONE TO EVERY FORM OF MEDIA //
    public static void checkedOut() {
        boolean checkedOut = false;
        if(checkedOut){
            System.out.println("checked out");
        } else {
            System.out.println("Is available for checkout");
        }
    }

    // NEEDS TO BE DECLARED FOR EVERY FORM OF MEDIA EXTENDED FROM THIS CLASS //

    abstract public void deviceNeeded();
    abstract public void materialMadeOf();
    abstract public void demolished();

    }

