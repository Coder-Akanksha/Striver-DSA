package BasicMaths;

import java.util.Scanner;

public class Reverse_a_number_2 {

    public static int reverse(int x) {

        // Variable to store the reversed number
        int rev = 0;
        while (x != 0) {
            int digit = x % 10; // Get the last digit
            x = x / 10; // Remove the last digit

            // Check for integer overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                    rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit; // Add the digit to the reversed number
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number that you want to reverse : ");
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println("Reversed number: " + result);

    }
}