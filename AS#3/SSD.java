// child class:SSD, parent class: HardDrive
public class SSD extends HardDrive {

    private int teraBytesWritten;

    // getter and setter
    public int getTeraBytesWritten() {
        return teraBytesWritten;
    }

    public void setTeraBytesWritten(int teraBytesWritten) {
    this.teraBytesWritten = teraBytesWritten;
    }


    // constructor
    public SSD(String make, String model, int capacity, int teraBytesWritten) {
        super(make, model, capacity);
        this.teraBytesWritten = teraBytesWritten;
    }
}
