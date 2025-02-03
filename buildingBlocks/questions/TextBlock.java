public class TextBlock {

    public static void main(String[] args) {

        var hello = """
                ant antelope \s \n
                cat "kitten" \
                seal sea lion
                """;

        System.out.print(hello);

        var eyeTest = """
                "Java study guide"
                  by Scott & Jeanne
                """;

        System.out.print(eyeTest);


    }
}
