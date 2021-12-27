
public class Assignment3b {
    public static void main(String[] args) {

        //create two objects, an apple and an orange
        Fruit apple = new Fruit("Apple", "Red");
        Fruit orange = new Fruit("Orange", "orange");

        //create a new 'other' fruit that uses the copy constructor to copy previous fruit object.
        Fruit other = new Fruit(apple);

        //to test comparing fruit object using the 'equals' function
        //test displaying the value of a fruit object using the 'toString' function
        if (apple.equals(other)) {
            System.out.println(apple.toString() + " is equal to " + other.toString());
        } else {
            System.out.println(apple.toString() + " is NOT equal to " + other.toString());
        }
    }
}
