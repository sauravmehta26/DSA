import java.util.Scanner;

public class lastc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input the sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by spaces
        
        // Loop through each word and print the last character

        for (String word : words) {
            if (!word.isEmpty()) {  // Check if the word is not empty
                // Print the last character of the word
                char lastChar = word.charAt(word.length() - 1);
                System.out.println("The last character of each word is:"+lastChar);


                

            }else{
                System.out.println("The string is empty.");
            }
        }
    }
}
