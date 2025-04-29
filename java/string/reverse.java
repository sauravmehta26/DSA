import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);           //  System.out.println("the reverse string is:"+reverse);

        }
        System.out.println("the reverse string is:"+rev);


    }
}