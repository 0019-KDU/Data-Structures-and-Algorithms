package DASQuestion;
import java.util.Stack;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from the stack and compare with the original string
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop() != input.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "A man a plan a canal Panama";
        String nonPalindrome = "Hello, World!";

        if (isPalindrome(palindrome)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        if (isPalindrome(nonPalindrome)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
