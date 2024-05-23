import java.util.*;

// Time Complexity - O(log n)
// Space Commplexity - O(1)
public class binary_search {
    static int binarySearch(int a[],int value){
        int low=0,high=a.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(value==a[mid])
            return mid;

            if (value< a[mid]) {
                high= mid-1;
            }
            
            else {
                low=mid+1;
            }
        }
        return -1;
    }
       public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};      //must be in a sorted form
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to search");
        int value = sc.nextInt();
        int ans=binarySearch(a,value);
        if(ans==-1)
        System.out.println("not found");
        else
        System.out.println("index of "+value +" is "+ ans);
        
    }
}
