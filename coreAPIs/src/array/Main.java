package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //The length of an array is established when the array is created. After creation, its length is fixed.
        // basic structure of the array

        int[] people = new int[3]; // all three elements have the value 0, because default value of int is 0
        int[] moreNumbers = new int[]{1, 2, 3, 4}; // this time because we have put values, default value won't be 0
        int [] array = {1, 2, 3, 4};
        int array01 [] = {1, 2};


        //there are few ways you can instantiate an array

        int[] numbers;
        int []numbers1;
        int [] numbers2;
        int numbers3[];
        int numbers4 [];

        int[] number01, number2; // both are arrays
        int numbers11[], number12; // one is an array, other is a variable

        // create java  arrays with reference types

        String[] bugs = {"lady bird", "beetle", "cricket"};
        String[] alias = bugs;

        System.out.println("check if equals "+alias.equals(bugs));

        System.out.println("array bugs "+ bugs);
        System.out.println("array bugs "+ Arrays.toString(bugs));

    }
}
