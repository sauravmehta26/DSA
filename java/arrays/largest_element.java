import java.util.*;
public class largest_element {
    public static int large(int arr[]){
        int n=arr.length;
        int min_value=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>min_value){
                min_value=arr[i];
                
            }

        }
        return min_value;
    }
    public static void main(String args[]){
        int arr[]={1,3,55,6,11};
        //int ans=large(arr);
       System.out.println("the largest element is : "+large(arr));
 

    }

    
}
