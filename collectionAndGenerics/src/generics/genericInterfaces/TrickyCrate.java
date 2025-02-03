package generics.genericInterfaces;

public class TrickyCrate <T> {

        // Generic method 'tricky' takes and returns an object of type T
        // formal parameter type  <T>
        public <T> T tricky(T t) {
        return t;
        }

        // Static method 'crateName' demonstrates the usage of the generic class
        public static String crateName() {
        // Use a raw type or specify the type for TrickyCrate
        TrickyCrate<String> crate = new TrickyCrate<>();
        return crate.tricky("bot"); // This works because we specified <String>
        }

        // Main method to test the class
        public static void main(String[] args) {
        System.out.println(crateName()); // Output: bot
        }

}
