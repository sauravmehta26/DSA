import java.util.*;
public class sumprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;int s,e;int count =0;
        System.out.println("The given range is:");
            s=sc.nextInt();
            e=sc.nextInt();
            for(int i=s;i<=e;i++){
                if(isprime(i)){
                    sum+=i;
                    count++;
                }
            }
        if(count>0){
           // sum+=i;
            System.out.println("the sum of pime number."+sum);

        }else{
            System.out.println("their is no  pime number.");

        }
    }
        public static boolean isprime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

