public class Hero extends Human {

    public Hero(String name) {
        super(name);
    }

    public void slashes(Zombie walkingDead){
        int newHealth = walkingDead.getHealth() - walkingDead.roll();
        walkingDead.setHealth(newHealth);
        System.out.println(this.getName() + ": WACK!");
    }
}

