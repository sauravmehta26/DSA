import java.util.*;

public class AveragePerfectNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, s, e;
        float avg;

        // Input range
        System.out.println("Enter the start range:");
        s = sc.nextInt();

        System.out.println("Enter the end range:");
        e = sc.nextInt();

        // Loop to find perfect numbers in the range
        for (int i = s; i <= e; i++) {
            if (perfectnumber(i)) {
                sum += i;
                count++;
            }
        }

        // Calculate and display average of perfect numbers
        if (count > 0) {
            avg = (float) sum / count;
            System.out.println("The average of perfect numbers is: " + avg);
        } else {
            System.out.println("There is no perfect number in the given range.");
        }
    }

    // Method to check if a number is perfect
    public static boolean perfectnumber(int n) {
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
