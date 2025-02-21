package practisePapers.week01_paper02;

import java.util.Arrays;
import java.util.List;

public class ListFactoryMethods {
    public static void main(String[] args) {


        String[] array = {"item01", "item02", "item03", "item04"};

        List<String> list = Arrays.asList(array);
        List<String> list_1 = Arrays.asList("item01", "item02", "item03", "item04");

        List<String> list01 = List.of("item01", "item02", "item03", "item04");
        List<String> list02 = List.of(array);

        List<String> list03 = List.copyOf(list01);

    }
}
