import java.util.Scanner;

public class HighLowGame {

    Player p1 = new Player();   //Computer
    Player p2 = new Player();   //You

    private void rollTheDice(){
        p1.roll();
        p2.roll();
        System.out.println("You both roll your dice....");
        System.out.println();
        System.out.printf("The computer rolled a %d and a %d\n", p1.getD1Value(), p1.getD2Value());
        System.out.printf("You rolled a %d and a %d", p2.getD1Value(), p2.getD2Value());
        System.out.println();
    }

    private void checkForWin(int betForYou, int betForComp) {
        if(p1.total() == p2.total()) {
            System.out.println("No Winner this time. Roll again.");
        } else {
            // If computer wins...
            if(p1.total() > p2.total()) {
                int p1Money = p1.getMoney() + betForComp;
                p1.setMoney(p1Money);
                int p2Money = p2.getMoney() - betForYou;
                p2.setMoney(p2Money);
                System.out.println("You LOST!\n");
            // If you win...
            } else {
                int p2Money = p2.getMoney() + betForYou;
                p2.setMoney(p2Money);
                int p1Money = p1.getMoney() - betForComp;
                p1.setMoney(p1Money);
                System.out.println("You WIN!\n");
            }
        }
    }

    public void Run() {

        String input;
        Scanner scanner = new Scanner(System.in);
        int betForYou;
        int betForComp;

        System.out.println("Game Begins!");
        System.out.println();

        do {
            System.out.printf("You: $%d, Computer: $%d", p2.getMoney(), p1.getMoney());
            System.out.println();
            System.out.print("What is your bet?");
            betForYou = scanner.nextInt();
            System.out.print("The computer bets: ");
            betForComp = scanner.nextInt();

            rollTheDice();
            checkForWin(betForYou, betForComp);

            //determine if the player still has money
            if (p1.getMoney() > 0 && p2.getMoney() > 0) {

                //if they have money, ask for playing again
                System.out.print("Play again? (y/n) ");
                input= scanner.next();
                System.out.println();

                //if they don't have money, they can't play
            } else {
                if (p2.getMoney() <= 0) {
                    System.out.println("You lost all your money.");
                } else {
                    System.out.println("The computer lost all the money.");
                }
                input = "n";
            }
        } while (!(input.equals("n")));
        System.out.printf("You left with $%d", p2.getMoney());
    }
}
