package byItAcademy.Lesson_12.Practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Person p = new Person("Андрей", "Анд", 20);
        Person p1 = new Person("Саня", "Аист", 15);
        Person p2 = new Person("Кеша", "Как", 12);
        TreeSet<Person> personHashSet = new TreeSet<>();
        personHashSet.add(p);
        personHashSet.add(p1);
        personHashSet.add(p2);
        allPerson(personHashSet);
    }
    public static void allPerson(Collection<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
