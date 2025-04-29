import java.io.*;
import java.util.*;

class SolutionClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // Number of segments
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // Start of range
        int y = Integer.parseInt(st.nextToken()); // End of range

        int[] diff = new int[100005]; // Difference array to apply range updates
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            diff[l]++;    // Increment at the start of the range
            diff[r + 1]--; // Decrement just after the end of the range
        }
        
        int current = 0, totalScore = 0;
        
        // Compute prefix sum and sum up scores for points in range [X, Y]
        for (int i = 1; i <= y; i++) {
            current += diff[i];
            if (i >= x && i <= y) {
                totalScore += current;
            }
        }
        
        System.out.println(totalScore);
    }
}