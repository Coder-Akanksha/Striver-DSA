package BasicMaths;

import java.util.Scanner;

public class Palindrome_Number_3 {

    public static boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        long reversed = 0;

        // Reverse the number
        while (x > 0) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x = x / 10;
        }

        // Compare original number with reversed number
        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));

        sc.close();
    }
}

// Time Complexity is O(log x)
// Space Complexity is O(1)