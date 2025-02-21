package constructorReference;

public class MyTestClass03 {
    public static void main(String... args) {

        StringCreator magic = x -> new String(x);
        System.out.println(magic.copy("abc"));

        String hello = new String("hello");
        System.out.println(hello);
    }
}
