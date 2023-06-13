package myExample;

import java.util.Collection;
import java.util.List;

public class CollectionTets {
    public static List<Person> collection = List.of(new Person(1,"54"),new Person(2,"123"));

    public static Person getCollection() {
        return collection.get(0);
    }
}
