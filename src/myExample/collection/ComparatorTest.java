package myExample.collection;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {
        new ComparatorTest().TreeSetCl();
        new ComparatorTest().TreeMapCl();
        ArrayListCl();
    }

    public void TreeSetCl() {
        class Sorted implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }
        TreeSet<Integer> set = new TreeSet<>(new Sorted());
        //TreeSet<Integer> set = new TreeSet<>((a,b) -> (b.compareTo(a)));
        set.add(4);
        set.add(3);
        set.add(6);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }

    public void TreeMapCl() {
        class Sorted implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                int k;
                k = o1.substring(o1.lastIndexOf(' ')).compareTo(o2.substring(o2.lastIndexOf(' ')));
                if (k == 0) {
                    return o1.compareTo(o2);
                }
                return k;
            }
        }
        class CompLastNames implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                return o1.substring(o1.lastIndexOf(' ')).compareToIgnoreCase(o2.substring(o2.lastIndexOf(' ')));
            }
        }
//        Альтернатива
        Comparator<String> cm = new CompLastNames().thenComparing((a, b) -> (a.compareToIgnoreCase(b)));
//        TreeMap<String, Integer> treeMap = new TreeMap<>(cm);
        TreeMap<String, Integer> treeMap = new TreeMap<>(new Sorted());
        treeMap.put("Никита Вдовенков", 16);
        treeMap.put("Артем Вдовенков", 14);
        treeMap.put("Вася Балаба", 11);

        treeMap.put("Никита Вдовенков", treeMap.get("Никита Вдовенков") + 100);
        Set<Map.Entry<String, Integer>> a = treeMap.entrySet();
        for (Map.Entry<String, Integer> z : a) {
            System.out.print(z.getKey() + " ");
            System.out.println(z.getValue());
        }

    }
    public static void ArrayListCl() {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(4);
        ar.add(-5);
        ar.add(3);
        ar.add(-20);

        Collections.sort(ar);
        System.out.println(ar);

        ar.sort(Comparator.reverseOrder());
        System.out.println(ar);

        Collections.shuffle(ar);
        System.out.println(ar);

        System.out.println("Максимальное значение " + Collections.max(ar));
        System.out.println("Минимальное значение " + Collections.min(ar));
    }
}
