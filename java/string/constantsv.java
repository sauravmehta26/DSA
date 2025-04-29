import java.util.*;
public class constantsv{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        
        int vcount=0,ccount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                    vcount++;
                }
                else{
                    ccount++;
                }
            }

        }
        System.out.println("Total vowels are:"+vcount);
        System.out.println("Total constants are:"+ccount);

    }
}