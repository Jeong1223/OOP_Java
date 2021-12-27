import java.util.Scanner;

/*
 This game has two player: Me and Computer
 Each Player has two dice and starts with $100.
 The players roll their dice
 The player with the higher dice total wins and get $20.
 The player with the lower dice total loses $40.
 If one of the players lose all the money, game ends.
*/

public class Assignment2c {
    public static void main(String[] args) {
        Double doubleGame = new Double();
        doubleGame.Run();

    }

public static class Double {

    Player p1 = new Player(); //User
    Player p2 = new Player(); //Computer

    private void rollTheDice() {
        p1.roll();
        p2.roll();

        System.out.printf("You rolled: %d and the computer rolled %d\n", p1.total(), p2.total());
    }

    private void checkForWin() {

        // if their dice totals are same...
        if (p1.total() == p2.total()) {
            System.out.println("No Winner this time. Roll again!");

        // if their dice totals are different...
        // The winner will earn $20, the loser will lose $40
        } else {
            // if I won...
            if (p1.getMoney() > p2.getMoney()){
                System.out.println("You WON!");
                int p1Money = p1.getMoney() + 20;
                p1.setMoney(p1Money);
                int p2Money = p2.getMoney() - 40;
                p2.setMoney(p2Money);
                System.out.printf("You have $%d and the computer have $%d\n", p1Money, p2Money);

            // if I lose...
            } else {
                System.out.println("You LOST!");
                int p2Money = p2.getMoney() + 20;
                p2.setMoney(p2Money);
                int p1Money = p1.getMoney() - 40;
                p1.setMoney(p1Money);
                System.out.printf("You have $%d and the computer have $%d\n", p1Money, p2Money);
        }
      }
    }

    public void Run() {

        String input;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("The Game Begins!");
            System.out.printf("You: $%d, Computer: $%d\n", p1.getMoney(), p2.getMoney());

            rollTheDice();
            checkForWin();

            //determine if the player still has money
            if (p1.getMoney() > 0 && p2.getMoney() >0 ) {

                //if they have money, they can play again.
                System.out.print("Play again? (y/n) ");
                input = scanner.nextLine();

                // if they don't have money, they can't play
            } else {
                input= "n";
            }

        // Stop the game with an input "n"
        } while (!(input.equals("n")));
        System.out.println("The Game ends...");
    }
  }
}


