 import java.util.*; 

 public class StringPallindrom {
    public static int CheckForPallindrom ( String str ) {
        int firstIndex = 0; int lastIndex = str.length() - 1;
        while ( firstIndex <= lastIndex ) {
            if ( str.charAt ( firstIndex ) == str.charAt( lastIndex  ) ) {
                firstIndex ++;
                lastIndex --;
                continue;
            }
            else
            return 0;
        }
        return 1;
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println ("enter String");
        String str = sc.nextLine();
        int result =  CheckForPallindrom ( str );
        if ( result == 1 ) {
            System.out.println( " This is a pallindrom string " );
        }
        else 
            System.out.println( " not a pallindrom string " );
    }
}
