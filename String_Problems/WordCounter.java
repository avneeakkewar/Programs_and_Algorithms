import java.util.*;

public class WordCounter {
    public static int  Counter ( String str ) {
        
        int count = 0;
        int wordcount = 0;

        // for ( int index = 0 ; index < str.length() ; index++ ) {
        //     if ( str.charAt(index) == ' ' &&  str.charAt( index + 1 ) !=  ' '  ) {
        //         count++;
        //     }
             
        //     wordcount = count+1;

        //             OR

            if( str == null || str.isEmpty())
             return 0;

            String word[] = str.split("\\s+");
            return word.length;

        }
        
    public static void main ( String[] args ) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter any sentence");
        String str=sc.nextLine();
       System.out.println( "no of words are : " + Counter ( str ) ); 

    }
}