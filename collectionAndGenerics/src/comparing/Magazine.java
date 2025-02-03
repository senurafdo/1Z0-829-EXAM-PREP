package comparing;

import java.util.TreeSet;

public record Magazine(String name) implements Comparable<Magazine> {

    public int compareTo(Magazine magazine) {
        return this.name.compareTo(magazine.name);
    }

}


