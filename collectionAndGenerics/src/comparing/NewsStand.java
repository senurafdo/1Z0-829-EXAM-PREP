package comparing;

import java.util.TreeSet;

public class NewsStand {
    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));

        System.out.println(set.iterator().next());
    }
}
