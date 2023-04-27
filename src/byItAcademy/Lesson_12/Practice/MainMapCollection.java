package byItAcademy.Lesson_12.Practice;

import java.util.HashMap;
import java.util.Map;

public class MainMapCollection {
    public static void main(String[] args) {
        Person p = new Person("Андрей", "Анд", 20);
        Person p1 = new Person("Саня", "Аист", 15);
        Person p2 = new Person("Кеша", "Как", 12);
        Map<Person, String> personMap = new HashMap<>();
        personMap.put(p,"director");
        personMap.put(p1,"plumber");
        personMap.put(p2,"engineer");
    }
}
