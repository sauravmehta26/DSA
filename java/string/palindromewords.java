import java.util.*;
public class palindromewords{
    public static boolean ispalindrome(String a){
        int l=0;
        int r=a.length()-1;
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
                l++;
                r--;
            
            }
            return true;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the String:");
            String a=sc.nextLine();
            System.out.println("Palindrome words in the sentence:");
             String[] b = a.split("\\s+");
            for(String wo:b){
                if(ispalindrome(wo)){
                    System.out.println(wo);
                }
            }
        }
    }
