import java.util.*;
public class evensum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s,e;
        int sum=0;
        System.out.println("Enter the range:");

        s=sc.nextInt();
        e=sc.nextInt();
            for(int i=s;i<=e;i++){
            if(iseven(i)){
            sum+=i;
        }
    }
    System.out.println("It is an even no so the sum is:"+sum);

    


    }
    public static  boolean iseven(int n){
            if(n%2==0){
              return true;


            }else{
                return false;

            }
        }
    }       