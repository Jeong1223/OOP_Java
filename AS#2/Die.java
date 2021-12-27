import java.util.Random;


public class Die {
    private int value;

    public Die() {
        Roll();
    }

    // get dice number from 'Random'
    public void Roll() {
        Random random = new Random();
        setValue(random.nextInt(6) + 1);
    }

    // getter to retrieve the value from 'private int value'
    public int getValue() {
        return value;
    }
    // setter to set the value
    public void setValue(int value) {
        this.value = value;
    }
}


