package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {

        var testDeque = new ArrayDeque<Integer>();
        testDeque.offer(18);
        testDeque.offer(5);

        System.out.println(testDeque);


    }
}
