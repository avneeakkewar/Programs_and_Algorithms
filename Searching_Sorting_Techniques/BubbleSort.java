import java.util.Scanner;

// Time Complexity - O(n^2)
// Space Commplexity - O(1)

public class BubbleSort {
    public static void bubbleSort (int arr[]) {
        for (int index = 0; index < arr.length -1; index ++ ){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ( arr[j] > arr[j+1] ) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    
    }

    public static void main ( String args[] )
    {
       Scanner sc = new Scanner ( System.in );
       System.out.println ( " enter no.of elements " );
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println ( " enter " + n + " elements " );
      
        for ( int index = 0; index < arr.length; index ++) {
            arr[index] = sc.nextInt();
        }
        bubbleSort(arr);

        for(int index = 0; index < arr.length; index++){ 
            System.out.print(arr[index]+ " ");  
        }
       
        
    }
}
