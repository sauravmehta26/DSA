import java.io.*;
import java.util.*;

class SolutionClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int maxLimit = 100005; // Increase the size for safe boundary handling
        int[] diff = new int[maxLimit]; 

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            diff[l]++;
            if (r + 1 < maxLimit) { // Prevent out-of-bound access
                diff[r + 1]--;
            }
        }

        int sum = 0, curr = 0;
        for (int i = x; i <= y; i++) {
            curr += diff[i];
            sum += curr;
        }
        System.out.println(sum);
    }
}