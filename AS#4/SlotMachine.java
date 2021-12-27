import java.util.Random;

public class SlotMachine {

    private Shape[] shapes;
    private int credit;

    private Random random = new Random();

    public SlotMachine() {
        credit = 0;
        shapes = new Shape[5];
    }

    public void addCredits(int amount) { //added money
        credit += amount;
    }

    public boolean hasCredits() {
        return credit > 0;
    }

    // display the  random shapes and check for matching
    public void pullArm() {
        draw();
        boolean win = checkForWin();
        displayResults();
        if (win) {
            addCredits(20);
            System.out.printf("WIN! $%d remaining\n", credit);
        } else {
            addCredits(-10);
            System.out.printf("LOSE... $%d remaining\n", credit);
        }

    }

    // Check whether the player wins.
    // if up to 3 consecutive shapes are matching, the player win.
    public boolean checkForWin() {
        return  (((shapes[0].getClass() == shapes[1].getClass()) && (shapes[1].getClass() == shapes[2].getClass())) ||
                ((shapes[1].getClass() == shapes[2].getClass()) && (shapes[2].getClass() == shapes[3].getClass())) ||
                ((shapes[2].getClass() == shapes[3].getClass()) && (shapes[3].getClass() == shapes[4].getClass())));

    }

    public void draw() {
        for (int i = 0; i < 5; i++) {
            int shapeOfNumber = random.nextInt(4);
            switch (shapeOfNumber) {
                case 0:
                    shapes[i] = new Bar();
                    break;
                case 1:
                    shapes[i] = new Triangle();
                    break;
                case 2:
                    shapes[i] = new Diamond();
                    break;
                case 3:
                    shapes[i] = new Square();
                    break;
                default:
                    break;
            }
        }
    }

    public void displayResults() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|");
                shapes[j].drawStage(i);
            }
            System.out.println("|");
        }
    }

}

