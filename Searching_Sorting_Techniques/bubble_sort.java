import java.util.Scanner;

// Time Complexity - O(n^2)
// Space Commplexity - O(1)
public class bubble_sort {
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    
    }

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.of elements");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("enter " +n + " elements");
      
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        bubbleSort(a);

        for(int i=0;i<a.length;i++){ 
            System.out.print(a[i]+ " ");  
        }
       
        
    }
}
