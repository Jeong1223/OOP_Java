public class Box implements Lookable, Lockable {

    protected boolean locked;
    //public boolean locked;

    public Box() {
        this.locked = true;
    }

    @Override
    public void unlock() {
        System.out.println("You've managed to pick the lock");
        locked = false;
    }

    @Override
    public void lookAt() {
        System.out.println("You see a key to the door in the box");

    }
}
