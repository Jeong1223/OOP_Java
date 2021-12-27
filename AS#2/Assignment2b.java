import java.util.Scanner;

public class Assignment2b {

    public static void main(String[] args) {

        // Take the current time using a Scanner.
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the current year, month, day, hour, minute, second:");

        int year = s.nextInt();
        int month = s.nextInt();
        int day = s.nextInt();
        int hour = s.nextInt();
        int minute = s.nextInt();
        int second = s.nextInt();

        // constructor for a new object
        DateTime dt1 = new DateTime(year, month, day, hour, minute, second);

        //call the method to print
        dt1.printDateTime();
    }
}
