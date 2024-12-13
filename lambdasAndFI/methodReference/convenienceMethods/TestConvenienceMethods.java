package convenienceMethods;

import java.util.function.Predicate;

public class TestConvenienceMethods {

    public static void main(String[] args) {

        Predicate<String> methodRef = String::isEmpty;
        //System.out.println(methodRef.test(""));

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> hello = "yellow"::contains;
        System.out.println("test hello "+ hello.test("HelloWorld"));;

        Predicate<String> brownEgg = egg.and(brown);
        System.out.println( "test AND method in  predicate " + brownEgg.test("brown"));;

        Predicate<String> otherEgg = egg.and(brown.negate());
        System.out.println( "test 02 AND method in  predicate " + otherEgg.test("eggs"));;

        


    }
     
    
}
