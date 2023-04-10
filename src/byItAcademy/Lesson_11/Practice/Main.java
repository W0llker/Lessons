package byItAcademy.Lesson_11.Practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Андрей", "Анд", 20);
        Person p1 = new Person("Саня", "Аист", 15);
        Person p2 = new Person("Кеша", "Как", 12);
        List<Person> personList = new ArrayList<>();

        personList.add(p);
        personList.add(p1);
        personList.add(p2);
        System.out.println(personList.get(0));

        Person checkCollection = new Person("Андрей", "Анд", 20);
        System.out.println(personList.contains(checkCollection));
        System.out.println("*****************************");
        Deque<Person> people = new ArrayDeque<>();
        people.add(p);
        System.out.println(people.getLast());


    }
}
