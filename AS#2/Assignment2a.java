public class Assignment2a {

    public static void main(String[] args) {

        // call the function 'exp' with the value of 2 to the exponent 8
        int value = exp(2,8);

        System.out.println(value);
    }

    //create a function with two int parameters
    public static int exp(int base, int exponent) {

        int value = 1;

        for (int i=0; i<exponent; i++) {
            value = value*base;
        }
        return value;
    }

}



