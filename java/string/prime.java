import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
            int s;
            int e;float avg;
            int sum=0,count=0;
            System.out.println("print the start and end range:");
            s=sc.nextInt();
            e=sc.nextInt();
            for(int i=s;i<=e;i++){
                if(isprime(i)){
                     sum+=i;
                    count++;



                }
            }
            if (count > 0) {
                avg = (float) sum / count;
                System.out.println("The average of prime numbers between " + s + " and " + e + " is: " + avg);
            } else {
                System.out.println("There are no prime numbers in the given range.");
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
