public class Zombie extends Human {

    public Zombie(String name) {
        super(name);
    }

    public void bites(Hero wonderHuman) {
        int newHealth = wonderHuman.getHealth() - wonderHuman.roll();
        wonderHuman.setHealth(newHealth);
        System.out.println(this.getName() + ": MUNCH!");
    }
}
