public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Madam";
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }
    }
}