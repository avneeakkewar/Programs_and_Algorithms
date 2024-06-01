import java.util.*;

public class SecondLargestNumber {
    public static void SecondLargest ( int arr[] ) {
        int newarr[] = new int [arr.length];
    
        Arrays.sort(arr);
       
        int k = 0;
        for( int index = 0; index < arr.length - 1; index++) {
            if ( arr [ index ] != arr [ index + 1 ] ) {
                newarr [ k ] = arr [ index ];
                k++;
            }
        }
       newarr[ k++ ] = arr[ arr.length -1 ];

       for (int j = 0; j < k; j++) {
        System.out.print ( newarr[j] + " " ); 
        
    }
    System.out.println ();
    System.out.println ("second largst element is: " + newarr [k-2]  );

    }

    public static void main (String args[])
     {
        
       Scanner sc = new Scanner(System.in);
       System.out.println ( " enter no. of elements " );
       int n=sc.nextInt();
       int arr[] = new int[n];
       System.out.println ( " enter " +n + " elements " );
      
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }

        SecondLargest(arr);   
     }

}
