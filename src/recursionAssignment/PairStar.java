package recursionAssignment;

/**
 * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 */

public class PairStar {
    
    public static String pairStar(String str){

        // Base Case (if no pairs)
        if (str.length() < 2){
            return str;
        }

        // Recursive Case
        // 0 is equal to the next character over
        // if first 2 characters are the same, need string build it
        // take first letter, put a star *, do a pairStar opperator on rest of string
        
        if (str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        // if dont find pair, move on
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
