import java.util.Scanner;

// Time Complexity - O(n^2)
// Space Commplexity - O(1)
public class selection_sort {
    public static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                min=j;
            }
            //swap
     int temp=a[i];
     a[i]=a[min];
     a[min]=temp;
    }
     
 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size  of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter "+n+" elements");
        for (int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        selectionSort(a);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
       
    }
}
