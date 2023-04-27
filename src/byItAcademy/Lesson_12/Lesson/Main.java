package byItAcademy.Lesson_12.Lesson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
1.	Создать коллекцию Set (реализация HashSet). Типизация коллекции – String.
2.	Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
3.	Вывести все записи.
4.	Проверить, содержит ли коллекция слово Конфета
5.	Посчитать количество элементов в коллекции

2. 2.	Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5.
Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.

1.	Создать Мапку, которая будет хранить названия отделов и соответствующее количество сотрудников в этих отделов.
Добавить записи в коллекцию.
1.1	Посчитать общее количество сотрудников.
1.2	Вывести все отделы в фирме
 */
public class Main {
    public static void main(String[] args) {
//        cheakSet();
        cheakMap();
    }

    public static void cheakMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "А");
        map.put(0, "Cqeqweq eqweqweq eqweqwe qewqweqe qweqeqw");
        map.put(2, "Dqweq2");
        map.put(4, "Sqweq");
        map.put(15, "E");
        map.put(6, "T");
        map.put(7, "Fasdad");
        map.put(8, "C");
        map.put(9, "V");
        map.put(10, "Lqeqe");
        int totalkey = 1;
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> a : entrySet) {
            if (a.getKey() > 5 && a.getValue().length() > 5) {
                System.out.println(a.getKey() + " " + a.getValue());
                totalkey *= a.getKey();
            }
            if(a.getKey() == 0) {
                System.out.println("Вывод строки " + a.getValue().replaceAll(" ",","));
            }
        }
        System.out.println("Перемноженные ключи " + totalkey);
    }

    public static void cheakSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Привет");
        stringSet.add("Как дела");
        stringSet.add("Праздник");
        stringSet.add("Суфле");
        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println(stringSet.contains("Конфета"));
        System.out.println(stringSet.size());
    }
}
