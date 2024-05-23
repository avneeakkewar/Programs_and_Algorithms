import java.util.*;

// Time Complexity - O(n^2)-worst case
//O(n) - best case
// Space Commplexity - O(1)
public class insertion_sort {
    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
         int temp=a[i];
         int j=i-1;
         while(j>=0 && temp<a[j]){
            a[j+1]=a[j]; // shift
            j--;
         }

         a[j+1]=temp;
        }
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter "+n+" elements");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }

         insertionSort(a);

         for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
         }
    }
    
}
