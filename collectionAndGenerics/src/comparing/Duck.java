package comparing;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
    public int compareTo(Duck o) {
        return name.compareTo(o.name); // sorts accesndigly by name
    }

    public static void main(String[] args) {
        var duck = new ArrayList<Duck>();
        duck.add(new Duck("Tom"));
        duck.add(new Duck("Ann"));
        Collections.sort(duck);

        System.out.println(duck);
    }

}
