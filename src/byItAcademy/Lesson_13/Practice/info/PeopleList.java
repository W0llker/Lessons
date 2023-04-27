package byItAcademy.Lesson_13.Practice.info;

import java.util.ArrayList;
import java.util.Collection;

public class PeopleList<T, V> {
    private Collection<Information<T, V>> collection;

    public PeopleList(Collection<Information<T, V>> collection) {
        this.collection = collection;
    }
    public Information<T,V> addInformation(T key,V value) {
        Information<T,V> information = new Information<>(key,value);
        collection.add(information);
        return information;
    }
    public void informationToString() {
        for (Information<T,V> information : collection) {
            System.out.println(information);
        }
    }
}
