public class Left_Rotate_D_places {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int k=9;
        int n=arr.length;
        k%=n;
        rev(arr,k,n-1);
        rev(arr,0,k-1);
        rev(arr,0,n-1); 
        for(int ele:arr){
        System.out.print(ele);  
}

    }
    static void rev(int[] array,int start, int end){
        while(start<end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
        }

    } 
}