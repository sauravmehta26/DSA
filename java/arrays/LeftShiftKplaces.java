public class LeftShiftKplaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        // 3456712
        int k = 2; // Number of places to shift left    
        int n = arr.length;
        k%=n; // Handle cases where k is greater than n
        rev(arr,k,n-1);
        rev(arr,0,k-1);
        rev(arr,0,n-1);
        printArray(arr);
    } 
    static void rev(int arr[],int start, int end) {
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
        static void printArray(int arr[]) {
            for (int ele:arr) {
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
// Output: 3 4 5 6 7 1 2


