import java.util.Scanner;

public class reverseword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input the sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");  // Split by spaces

        // String to store the final result
        String result = "";

        // Loop through each word
        for (String word : words) {
            String reversedWord = "";

            // Reverse the word manually
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            // Append the reversed word to the result
           result += reversedWord + " ";
        }

        // Print the sentence with each word reversed
        System.out.println("The sentence with each word reversed is:");
        System.out.println(result.trim());  // Trim the extra space at the end
    }
}
