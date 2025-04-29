import java.util.*;
public class secondlargest{
    public static int slargest(int arr[]){
        int n=arr.length;
        int l=-1;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
            sl=l;
            l=arr[i];
        }else if(arr[i]>sl && arr[i]!=l){
            sl=arr[i];
        }
        }
        return sl;
    }
    public static void main(String[] args) {
        int arr[]={-8,9,2,4,8};
        System.out.println("sl is: "+slargest(arr));
    }
}