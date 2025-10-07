import java.util.*;

public class Q5_PalindromeDeque {
    static boolean isPalindrome(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) dq.addLast(Character.toLowerCase(c));
        }
        while (dq.size() > 1) {
            if (!Objects.equals(dq.removeFirst(), dq.removeLast())) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {
                "racecar",
                "A man, a plan, a canal: Panama",
                "No lemon, no melon",
                "hello"
        };
        for (String t : tests) {
            System.out.println('"' + t + '"' + " -> " + isPalindrome(t));
        }
    }
}
