public class HardDrive {

    //encapsulation
    private String make;
    private String model;
    private int capacity;

    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // parameterized constructor
    public HardDrive(String make, String model, int capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

}
