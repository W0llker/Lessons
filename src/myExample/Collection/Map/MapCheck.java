package myExample.Collection.Map;

import java.util.*;

public class MapCheck {
    public static void main(String[] args) {
//      MapCheck.HashMapCl();
//      TreeMapCl();
        LinkedHashMapCl();
    }
    static void HashMapCl() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Вася",15);
        hashMap.put("Слава",25);
        hashMap.put("Семен",34);

        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();
        for (Map.Entry<String, Integer> m : set) {
            System.out.print(m.getKey() + " ");
            System.out.println(m.getValue());
        }
        int balanc = hashMap.get("Слава");// Можно так ↓↓↓↓↓↓↓
        hashMap.put("Слава",balanc + 10); // hashMap.put("Слава",hashMap.get("Слава") + 10);
        System.out.println("Новый баланс Славы = " + hashMap.get("Слава"));
    }
    static void TreeMapCl() {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"A");
        treeMap.put(3,"C");
        treeMap.put(2,"B");
        Set<Map.Entry<Integer,String>> set = treeMap.entrySet();
        for (Map.Entry<Integer,String> s : set) {
            System.out.print(s.getKey() + " ");
            System.out.println(s.getValue());
        }
        treeMap.put(1,treeMap.get(1) + " C");

        for (Map.Entry<Integer,String> s : set) {
            System.out.print(s.getKey() + " ");
            System.out.println(s.getValue());
        }
    }
    static void LinkedHashMapCl() {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2,"C");
        linkedHashMap.put(1,"D");
        linkedHashMap.put(3,"F");

        Set<Map.Entry<Integer,String>> set = linkedHashMap.entrySet();
        for (Map.Entry<Integer,String> s : set) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
