import java.util.*;

public class VowelsInString {
    public static void  Vowels(String str) {
        for ( int index =0 ;index < str.length() ; index++ ) {
            char ch = str.charAt(index);
            if ( ch =='A' || ch == 'a' || ch == 'E'|| ch =='e' || ch == 'I' || ch == 'i' || ch == 'O' || ch =='o' || ch == 'U' || ch == 'u')
            System.out.println (" present vowels are: " + ch + " at index " + index );  
            continue;
                  
            }
            System.out.println ("not present ");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter string");
        String str = sc.nextLine();
        Vowels ( str );
     

    }
}
