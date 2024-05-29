import java.util.*;

public class VowelCounter {
    public static void Counter ( String str ) {
        int count=0;
        for ( int index = 0 ; index < str.length() ; index++ ) {
        
           char ch = str.charAt(index);
            if ( ch =='A' || ch == 'a' || ch == 'E'|| ch =='e' || ch == 'I' || ch == 'i' || ch == 'O' || ch =='o' || ch == 'U' || ch == 'u') {
                count++;
            } 
           
        }
        if ( count==0 )
            System.out.println (" not present");
         else
            System.out.println (" No of vowels present are: " + count);
        
        }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("enter string");
        String str = sc.nextLine();
        Counter ( str );
    

    }
}
