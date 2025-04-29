import java.util.Scanner;

public class split {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input the string from the user
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        
        // Split the string into words using space as the delimiter
        String[] words = s.split(" ");
        
        // Print each word on a new line
        System.out.println("The split words are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
