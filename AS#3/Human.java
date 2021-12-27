import java.util.Random;

public class Human {
    private String name;
    private int health;

    // getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    // constructor
    public Human(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        if (this.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //create a 'roll' function that will return a random number between 1-6
    public int roll() {
        Random r = new Random();
        return r.nextInt(6)+1;
    }
}
