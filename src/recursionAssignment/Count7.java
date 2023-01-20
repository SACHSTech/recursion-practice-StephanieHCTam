package recursionAssignment;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 */

public class Count7 {

    public static int count7(int n){

        // Base Case
        if(n == 0){
            return 0;
        }

        // Recursive Case
        // get last digit
        // check how many 7s in remaining number
        // parameter: n/10 --> divide integer division remove rightmost digit
        // if 7: add count to count7
        if(n % 10 == 7){
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }
}