public class Sorted_or_not {
    public static void main(String[] args) {
        int []arr= {1, 2, 3, 4, 5,1,2};
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("The array is not sorted");
                return;
            }
        }
            System.out.println("The array is sorted");
    } 

}
