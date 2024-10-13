public class MissingElement{

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
    int sum = 0;
       int totalSum =  (n*(n+1))/2;
       for ( int i=0 ; i < arr.length; i++) {
           sum = sum + arr[i];
           
       }
       int ans = totalSum - sum;
       return ans;// Your Code Here
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int n = 7;
        MissingElement obj = new MissingElement();
        int result = obj.missingNumber(n,arr);
        System.err.println(result);

    }


}

