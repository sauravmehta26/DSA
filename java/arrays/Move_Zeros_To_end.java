public class Move_Zeros_To_end {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,0,4,5,6,0,7,0,2,3};
        int j=0;
        int n=arr.length;
        // j tracks the index where non zero element should go 
        // and whenever i gets a non zero element it swaps with j and goes on increasing index 
        // and then j increases it index
         for (int i =0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
         }
         for(int ele:arr){
            System.out.print(ele+" ");
         }
    }
    static void swap(int arr[],int s,int e){
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
    }
    
}
