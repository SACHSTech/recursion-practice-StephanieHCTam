package recursionAssignment;

public class Recursion{

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */

    public static int count7(int n){

        // Base Case
        if(n == 0){
            return 0;
        }

        // Recursive Case
        if(n % 10 == 7){
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    /**
     * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
     */

     public static int countHi(String str){
        // Base Case (cannot contain "hi")
        if (str.length() < 2){
            return 0;
        }

        // Recursive Case
        if(str.substring(0, 2).equals("hi")){
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
     }

     /**
     * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
     */

     public static String changePi(String str){

        // Base Case
        if (str.length() < 2){
            return str;
        }

        // Recursive Case
        if (str.substring(0, 2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        return str.substring(0, 1) + changePi(str.substring(1));
    }

    /**
     * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
     */
    public static String pairStar(String str){

        // Base Case (if no pairs)
        if (str.length() < 2){
            return str;
        }

        // Recursive Case
        if (str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }






}
