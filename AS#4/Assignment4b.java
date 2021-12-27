public class Assignment4b {
    public static void main(String[] args) {

        SlotMachine slotmachine = new SlotMachine();
        slotmachine.addCredits(40);
        System.out.println("$20 in credits added!");

        // if credits > 0
        while (slotmachine.hasCredits()) {
            slotmachine.pullArm();
        }
        // if credits <= 0
        System.out.println("No more credits!");
    }
}


