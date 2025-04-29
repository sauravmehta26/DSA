import java.util.*;

public class CountPerfectNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s, e;
        int count = 0; // Initialize count outside of loop
        System.out.println("Enter the start and end of the range:");
        s = sc.nextInt();
        e = sc.nextInt();

        // Loop through range to check for perfect numbers
        for (int i = s; i <= e; i++) {
            if (isperfect(i)) {
                count++;
                System.out.println(i + " is a perfect number.");
            }
        }

        // Output count of perfect numbers
        System.out.println("Total perfect numbers in the range: " + count);
    }

    // Method to check if a number is perfect
    public static boolean isperfect(int n) {
        int sum = 0;

        // Find divisors and sum them
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Return true if sum of divisors equals the number
        return sum == n;
    }
}
