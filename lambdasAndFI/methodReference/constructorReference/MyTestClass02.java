package constructorReference;

public class MyTestClass02 {

    public static void main(String[] args) {

        EmptyStringCreater emptyStringCreater = new EmptyStringCreater() {
            @Override
            public String create() {
                return "";
            }
        };

        EmptyStringCreater emptyStringCreater2 = () -> {
            return "";
        };
        EmptyStringCreater emptyStringCreater1 = () -> {
            return new String();
        };

        EmptyStringCreater methodReference = String :: new;
    }
}
