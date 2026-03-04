import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return word.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.add(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy = new StackStrategy();

        if (strategy.checkPalindrome(word)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }
    }
}