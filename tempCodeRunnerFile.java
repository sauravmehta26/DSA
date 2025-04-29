import java.util.*;
public class secondlargest{
    public static int sl(int arr[]){
        int l=-1;
        int n=arr.length;
        int sl=Integer.min_value;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }//if (sl<l&&sl !=l)
        }
        return sl;
    }
    public static void main(String args[]){
        int arr[]={1,34,56,77,88,99};
        System.out.println("the sl is: "+sl(arr));


    }
}