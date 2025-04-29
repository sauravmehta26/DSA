import java.util.*;
public class replacev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the String:");
        String s=sc.nextLine();
        //for(int i=0;i<s.length();i++){
            String result =s.replaceAll("[aeiouAEIOU]","");
        
        System.out.println("the result is:"+result);

    }
}