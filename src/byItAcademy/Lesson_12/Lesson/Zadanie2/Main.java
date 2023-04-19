package byItAcademy.Lesson_12.Lesson.Zadanie2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map = personStringMap();;
        Map<String, List<Person>> reversMap = reversMap(map);
        result(reversMap);
    }
    public static void result(Map<String, List<Person>> listMap) {
        Set<Map.Entry<String, List<Person>>> entrySet = listMap.entrySet();
        for (Map.Entry<String, List<Person>> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, List<Person>> reversMap(Map<Person, String> map) {
        Set<String> stringSet = new HashSet<>(map.values());
        return listPerson(stringSet, map);
    }

    private static Map<String, List<Person>> listPerson(Set<String> set, Map<Person, String> map) {
        Map<String, List<Person>> personMap = new HashMap<>();
        for (String s : set) {
            personMap.put(s, addPerson(s, map));
        }
        return personMap;
    }

    private static List<Person> addPerson(String key, Map<Person, String> map) {
        List<Person> personList = new ArrayList<>();
        Set<Map.Entry<Person, String>> mapSet = map.entrySet();
        for (Map.Entry<Person, String> maps : mapSet) {
            if (key.equals(maps.getValue())) {
                personList.add(maps.getKey());
            }
        }
        return personList;
    }

    public static Map<Person, String> personStringMap() {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person(1, "Никита", "Вдовенков", 21), "Балбес");
        map.put(new Person(2, "Иван", "Иванушкин", 15), "Повар");
        map.put(new Person(3, "Петя", "Петров", 12), "Полицмен");
        map.put(new Person(4, "Саня", "Мохнатый", 28), "Повар");
        map.put(new Person(5, "Кирилл", "Тормоз", 35), "Балбес");
        map.put(new Person(6, "Сергей", "Малой", 18), "Повар");
        map.put(new Person(7, "Влад", "Старый", 24), "Балбес");
        map.put(new Person(8, "Антон", "Антонов", 21), "Полицмен");
        return map;
    }
}
