package aboutString;

public class EqualsOperator {
    public static void main(String[] args) {

        // equals and == act differently

        //equals on Strings

        var name = "Chester";
        var name2 = "Chester ";

        System.out.println(name == name2.trim()); // this check the reference
        System.out.println(name.equals(name2)); // this check the object value


        var x = "hello world";
        var y = " hello world".trim();
        System.out.println("xy "+(x == y));
        System.out.println("xy "+ x.equals(y));

        String abc = "ABC";
        String abc2 = "ABC";
        System.out.println(abc == abc2);


        var myName = "Chester";
        var builder = new StringBuilder("Chester");
        System.out.println("String and StringBuilder " + myName.equals(builder));


        System.out.println("----- equals on arrays-----");
        String[] arr = {"abc"};
        String[] arr1 = {"abc"};
        System.out.println("usage "+ (arr.equals(arr1)));
    }
}
