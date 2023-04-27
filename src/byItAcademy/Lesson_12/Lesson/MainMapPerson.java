package byItAcademy.Lesson_12.Lesson;

import byItAcademy.Lesson_12.Practice.Person;

import java.util.*;

public class MainMapPerson {
    public static void main(String[] args) {
        Map<String, List<Person>> listMap = new HashMap<>();

        List<Person> list = new ArrayList<>();
        list.add(new Person("Андрей", "Анд", 20));
        list.add(new Person("Саня", "Pump", 21));
        list.add(new Person("Валера", "Sets", 22));
        list.add(new Person("Чупик", "Дент", 23));
        list.add(new Person("Андрей", "Groomp", 24));

        listMap.put("Охрана",list);
        listMap.put("Экомический",list);
        listMap.put("Семейный",list);

        Set<Map.Entry<String,List<Person>>> person = listMap.entrySet();
        int totalPerson = 0;
        for (Map.Entry<String,List<Person>> a : person) {
            System.out.println(a.getKey());
            totalPerson +=  a.getValue().size();
        }
        System.out.println("Общее кол-во сотрудников во всех отделениях " + totalPerson);
    }
}
