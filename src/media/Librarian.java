package media;

import java.util.Date;

public class Librarian extends Person{

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
        this.lastScan = date;
    }
}
