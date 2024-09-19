 import java.util.*;
 
 class Subarrays{
    public static int count(int n , int k , int arr[]) {
        int cnt = 0;
       
        for (int i=0; i < arr.length;i++){
            int  currMin = arr[i];
            int currMax = arr[i];
            for (int j=i; j < arr.length; j++) {
                currMin = Integer.min(arr[j],currMin);
                currMax = Integer.max(arr[j],currMin);

                if (currMax + currMin <= k ){
                   cnt = cnt +1;
                }
                else{
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        System.out.println("Enter" + n + "elements of array");
        int arr[] = new int[n];
        for (int i =0;i< n ;i++){
            arr[i] = sc.nextInt();
        }

       int result =  count(n, k, arr);
       System.out.println(result);
    }
}