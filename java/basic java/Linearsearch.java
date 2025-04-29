import java.util.*;
public class Linearsearch{
    public static void main(String args[])
    {
    int num[]={23,45,1,2,8,66,-1,-44,88};
    int target=88;
    int ans=Linearsearch(num,target);
    System.out.println(ans);
    }
    static int linearsearch(int arr[],int tareget)
    {
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element==arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}