package myExample.Collection;

import java.util.*;

public class CollectionFr {
    public static void main(String[] args) {
        //CollectionFr.ArrayCl();
        //CollectionFr.LinkedListCl();
        //CollectionFr.HashSetCl();
        //CollectionFr.LinkedListCl();
        //CollectionFr.LinkedHashSetCl();
        //CollectionFr.TreeSetCl();
//        CollectionFr.ArrayDequeCl();
    }
    static void ArrayCl() {
        ArrayList<String> color = new ArrayList<>();
        color.add("blue");
        color.add("yellow");
        color.add("blue");
        color.add("red");
        System.out.println(color);
        color.add(1,"white");
        System.out.println(color);
        color.remove(2);
        color.remove(3);
        System.out.println(color);

        String[] list = new String[color.size()];
        list = color.toArray(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
    static void LinkedListCl() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("D");
        linkedList.add("X");
        linkedList.add("C");
        linkedList.add("Z");
        linkedList.addLast("R");
        linkedList.addFirst("Y");
        System.out.println(linkedList);

        linkedList.removeFirst();
        String val = linkedList.get(2) + "123";
        linkedList.set(2,val);
        System.out.println(linkedList);
    }
    static void HashSetCl() {
        HashSet<String> set = new HashSet<>();
        set.add("Альфа");
        set.add("Бета");
        set.add("Гамма");
        System.out.println(set);
    }
    static void LinkedHashSetCl() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Альфа");
        set.add("Бета");
        set.add("Гамма");
        System.out.println(set);
    }
    static void TreeSetCl() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(1);  //Повторение не записываются
        set.add(0);
        set.add(9);
        set.add(3);
        System.out.println(set);
    }
    static void ArrayDequeCl() {
        ArrayDeque<String> set = new ArrayDeque<>();
        set.push("A");
        set.push("D");
        set.push("C");
        set.push("R");
        while (set.peek() != null)
            System.out.println(set.pop() + " ");
    }
}
