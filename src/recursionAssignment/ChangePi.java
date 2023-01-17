package recursionAssignment;

/**
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
 */

public class ChangePi {

    public static String changePi(String str){

        // Base Case
        if (str.length() < 2){
            return str;
        }

        // Recursive Case
        if (str.substring(0, 2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }

        // skip over the 2 letters, check the rest of the word
        // take the first letter, check for "pi" string from the rest of the word
        // starting from second letter onwards
        // take first character, add to rest of string, check for pi
        return str.substring(0, 1) + changePi(str.substring(1));
    }
}