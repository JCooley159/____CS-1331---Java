import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.nextLine();
        word = word.toLowerCase();
        word = word.replaceAll("\\s", "");

        int i = 0;
        int length = word.length();
        int j = length - 1;
        boolean isPalindrome = true;

        while (i <= length/2) {
            if (word.charAt(i) == word.charAt(j)) {
                i = i + 1;
                j = j - 1;
            } else {
                isPalindrome = false;
                i = i + 1;
                j = j - 1;
            }
        }

        if (isPalindrome == true) {
            System.out.println("Is a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
