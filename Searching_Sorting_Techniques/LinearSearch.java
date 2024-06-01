import java.util.*;

// Time Complexity - O(n)
// Space Commplexity - O(1)

public class LinearSearch {

    public static int linearSearch ( int arr[],int value ) {
        for ( int index = 0; index < arr.length; index ++ ){
            if ( arr[index] == value )
                return index;      
        }
        return -1;
       
    }

    public static void main (String args[]) {  
        Scanner sc = new Scanner(System.in);
        System.out.println ( " enter no. of elements " );
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println ( " enter elements " );
            for(int index = 0; index <= arr.length-1; index ++) {
                arr[index] = sc.nextInt();
            }

        System.out.println ( " enter value to search " );
        int value = sc.nextInt();
        int ans = linearSearch( arr , value );
        if ( ans == -1 )
        System.out.println( " not found " );
        else
        System.out.println( " index of " + value + " is " + ans);
        
    }
}
