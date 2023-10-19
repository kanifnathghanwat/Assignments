import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter input string: ");
        Scanner sc=new Scanner (System.in);
        String input=sc.next();
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        HashSet<Character> alphabetSet = new HashSet<>();

        // Add all lowercase letters to the set
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        // Convert input to lowercase and check if it contains all letters
        String lowercaseInput = input.toLowerCase();
        for (char c : lowercaseInput.toCharArray()) {
            // Check if the character is a lowercase letter
            if (Character.isLetter(c)) {
                alphabetSet.remove(c); // Remove the letter from the set
            }
        }

        // If the set is empty, input is a pangram
        return alphabetSet.isEmpty();
    }
}
