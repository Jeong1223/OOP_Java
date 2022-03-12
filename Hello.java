public class Hello {
    public static void main(String[] args) {

        // How do you reverse a string in Java?
        String str = "hello";
        String reverse = "";
        int length = str.length();
        for (int i = 0; i < length; i++){
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);

        //How do you determine if a string is palindrome?
        if (str.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //Find the number of occurrences of a character in a String?
        int count = 0;
        char search = 'h';

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == search) {
                count++;
            }
        }
        System.out.println(count);

        // Find if the given two strings are anagrams or not?
        boolean anagrmstat = false;
        if (str.length() != reverse.length()){
            System.out.println(str + " and " + reverse + " not anagrams string");
        } else {
            char[] anagram1 = str.toCharArray();
            char[] anagram2 = reverse.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            anagramstat = Arrays.equals(anagram1, anagram2);
        }
        if (anagramstat == true) {
            System.out.println(" anagrams string");
        } else {
            System.out.println(" not anagrams string");
        }
    }
}
