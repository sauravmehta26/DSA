import java.util.*;
public class toggle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        StringBuilder n=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
            n.append(Character.toLowerCase(ch));
        }
        else if (Character.isLowerCase(ch))         {
            n.append(Character.toUpperCase(ch));


        }
        else{
            n.append(ch);
           // System.out.println("Their is no alphabets");
        }
    }
    System.out.println("The output is:"+n.toString());


    }
}