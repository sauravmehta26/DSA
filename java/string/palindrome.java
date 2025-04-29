import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){       
            rev+=s.charAt(i);
          
         } if(s == rev){
            System.out.println("It is a Palindrome");


           }else{
            System.out.println("It is not a palindrome");

        }
    } 
}