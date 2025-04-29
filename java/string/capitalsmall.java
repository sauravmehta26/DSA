import java.util.*;
public class capitalsmall{
    public static void main(String a4gs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        StringBuilder sl=new StringBuilder();
        StringBuilder cl=new StringBuilder();


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);


        
        if(ch>='a'&& ch<='z'){
            sl.append(Character.toLowerCase(ch));       }
    else if(ch>='A' &&ch<='Z'){
        cl.append(Character.toUpperCase(ch));
    }
}
System.out.println("the Capitals are:"+cl.toString());
System.out.println("the small alphabets are:"+sl.toString());

}
}