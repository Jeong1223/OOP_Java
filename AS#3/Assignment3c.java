public class Assignment3c {
    public static void main(String[] args) {

        //create objects
        Zombie walkingDead = new Zombie("Rotten Rob");
        Hero wonderHuman = new Hero("Blasting Bob");

        // set the default value of health
        walkingDead.setHealth(25);
        wonderHuman.setHealth(25);

        // if they are alive...
        while (walkingDead.isAlive() && wonderHuman.isAlive()) {
            // wonderHuman wins
            if (wonderHuman.roll() > walkingDead.roll()) {
                wonderHuman.slashes(walkingDead);
            // walkingDead wins
            } else {
                walkingDead.bites(wonderHuman);
            }
        // One of them dies...
        } if (wonderHuman.getHealth() > walkingDead.getHealth()) {
            System.out.println(wonderHuman.getName()+": Take that vile beast!");
        } else {
            System.out.println(walkingDead.getName()+": Mmmm! Brains..");
        }
    }
}

