import java.util.Scanner;

// EscapeRoom implements Lookable, Lockable interface
public class EscapeRoom implements Lookable, Lockable {

    private boolean locked;
    private Box box;

    public EscapeRoom() {
        this.locked = true;
        this.box = new Box();
    }

    @Override
    public void lookAt() {
        // The body of lookat()
        if (box.locked) {
            System.out.println("You see a plain metal box with a large padlock.");
        } else {
            box.lookAt();
        }
    }

    @Override
    public void unlock() {
        if (box.locked) {
            System.out.println("You first need to unlock the box.");
        } else {
            System.out.println("You use the key in the box to unlock the door and you're free.");
            locked = false;
        }
    }

    public void play() {

        System.out.println("You wake up in the middle of a locked room.");
        Scanner s = new Scanner(System.in);

        while (locked) {
            System.out.println("What would you like to do?");
            String input = s.nextLine();

            if (input.equals("look around")) {
                lookAt();
            } else if (input.equals("unlock the box")) {
                box.unlock();
            } else if (input.equals("unlock the door")) {
                unlock();
            } else {
                System.out.println("Sorry, can't do that");
            }
        }
    }
}
