import java.util.*;

public class WordOccuranceCounter {
    public static int wordCounter ( String str , String word) {
        int count = 0 ;
       
        String temp[] = str.split( " ");
        for ( int index = 0 ; index < temp.length  ; index ++ ) {
           
            if (  word.equals(temp [ index ]) ){
               count = count + 1;
              continue;
            }         
        }
        return count;
    }
    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter any sentence");
        String str=sc.nextLine();
        System.out.println( " Enter Word to Search ");
        String word = sc.nextLine();
        int result= wordCounter(str, word);
        if(result == 0 )
        System.out.println( " not found ");
        else
        System.out.println( " no. of occurance of word is:  " + result);

}

}