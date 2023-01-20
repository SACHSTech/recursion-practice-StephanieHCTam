package recursionAssignment;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 */

public class CountHi {

    public static int countHi(String str){

        // Base Case (cannot contain "hi")
        if (str.length() < 2){
            return 0;
        }

        // Recursive Case
        // substring from index 0 to 2, (gives first 2 characters) = string "hi" --> found 1
        // add 1 + check rest of the word
        // call count hi method again and chop off first 2 characters of string
        if(str.substring(0, 2).equals("hi")){
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));

    }
    
}
