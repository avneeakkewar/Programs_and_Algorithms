import java.util.*;

class RemoveOuterParantheses {
    public static String removeOuterParentheses(String s) {
        char[] ch = s.toCharArray();
      int counter =0 ;
      String ans ="";
      for ( int i = 0; i < s.length() ; i++) {
           
            if ( ch[i] == ')') {
                counter--;
            }
            if ( counter != 0 ) {
            ans = ans + ch[i];
        }
             if ( ch[i] == '(' ){
                counter++;
            }
      }
       
        return ans;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println( " Enter any string " );
    String s = sc.nextLine();
    removeOuterParentheses(s);
} 
} 

