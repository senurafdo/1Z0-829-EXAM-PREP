package array;

import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {

        int[] array01 = {1};
        int[] array02 = {1};

        System.out.println(Arrays.mismatch(array01, array02)); //output is -1 since there is no mismatch

        int[] array03 = {1, 2};
        int[] array04 = {1, 2, 3};
        System.out.println(Arrays.mismatch(array03, array04)); // output is 2 since first mismatch can be found in  2nd element


    }
}
