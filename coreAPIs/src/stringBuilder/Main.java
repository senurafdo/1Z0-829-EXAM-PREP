package stringBuilder;

public class Main {
    public static void main(String[] args) {
        //1st way
        StringBuilder builder01 = new StringBuilder();
      //  builder01 = "test";  // not possible

        StringBuilder builder02 = new StringBuilder("HelloWorld");
        // builder02 = "";  // not possible

        StringBuilder builder03 = new StringBuilder(12);
        // builder03 = "hello"; //not possible

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1; // sb2 now refers to the same object as sb1
        sb1 = new StringBuilder("World"); // Now sb1 points to a new object, but sb2 still refers to the old one

    }
}
