public class Player {

    // encapsulate money they have and two die objects
    private int money;
    private Die die1;
    private Die die2;
    private int total;

    public Player() {
        money = 100;  //initialize the money
        die1 = new Die();
        die2 = new Die();
    }

    // 'roll' method to randomize their dice
    public void roll() {
        die1.Roll();
        die2.Roll();
    }

    // 'total' method to get double dice total.
    public int total() {
        total = die1.getValue() + die2.getValue();
        return total;
    }

    // setter to set the value of money
    public void setMoney(int money) {
        this.money = money;
    }
    // getter to retrieve the private value from 'money'
    public int getMoney() {
        return money;
    }

    public int getD1Value() {
        return die1.getValue();
    }

    public int getD2Value() {
        return die2.getValue();
    }
}


