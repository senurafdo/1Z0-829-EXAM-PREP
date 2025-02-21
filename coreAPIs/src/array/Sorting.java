package array;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {

       int []numbers = {6, 9, 1};
       Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        System.out.println(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers)); // print the array using Arrays


        String[] stringArray = {"10", "9", "100"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));// String sort thing in alphabetic order
        // numbers before letters.  uppercase before lowercase

      //  int[] randomNumbers = {2, 3, 4, 5, 6, null}; <- null can not be placed in int







    }
}
