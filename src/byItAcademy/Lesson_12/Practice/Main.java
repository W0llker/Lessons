package byItAcademy.Lesson_12.Practice;

import byItAcademy.Lesson_12.Practice.Person;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person("Андрей", "Анд", 20);
//        Person p1 = new Person("Саня", "Аист", 15);
//        Person p2 = new Person("Кеша", "Как", 12);
//        Set<Person> personHashSet = new HashSet<>();
//        personHashSet.add(p);
//        personHashSet.add(p1);
//        personHashSet.add(p2);
//        allPerson(personHashSet);
    }
    public static void allPerson(Collection<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
