import java.util.*;

// Time Complexity - O(n)
// Space Commplexity - O(1)
public class linear_search {

    public static int linearSearch(int a[],int value){
        for(int i=0;i<a.length;i++){
            if (a[i]==value)
                return i;      
        }
        return -1;
       
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
            for(int i=0;i<=a.length-1;i++){
                a[i]=sc.nextInt();
            }

        System.out.println("enter value to search");
        int value = sc.nextInt();
        int ans=linearSearch(a,value);
        if(ans==-1)
        System.out.println("not found");
        else
        System.out.println("index of "+value +" is "+ ans);
        
    }
}
