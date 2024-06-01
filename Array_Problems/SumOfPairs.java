import java.util.*;

public class SumOfPairs {
    public static void Pairs( int arr[] , int sum) {
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = i+1; j < arr.length; j++) {
                 if ( arr[i] + arr[j] == sum) {
                    System.out.println( "( " + arr[i] + " ," + arr[j] + " )" );
                 }
            }
        }
    }
     
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println( " enter no. of elements " );
       int n=sc.nextInt();
       int arr[] = new int[n];
       System.out.println("enter " + n + "  elements");
      
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println( " Enter value of sum ");
        int sum = sc.nextInt();

        Pairs( arr,sum);
}

}

