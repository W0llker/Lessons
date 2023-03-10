package myExample.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Spliterator;

public class Iterators {
    public static void main(String[] args) {
//      Iterators.IteratorCl();
//      Iterators.forEach();
        Iterators.splIteraris();
    }
    static void IteratorCl () {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("F");
        al.add("E");

//  Просто перебор коллекции
        Iterator<String> iterator = al.iterator();
        System.out.println("Просто выводим коллекцию через итератор");
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + " ");
        }

//  Изменил коллекцию и вывел ее
        ListIterator<String> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next(); // можно так написать
            listIterator.set(s + "+");      // listIterator.set(listIterator.next() + "+")
        }

//  Тот же перебор коллекции
        iterator = al.iterator();
        System.out.println("\nВывод измененной коллекции");
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + " ");
        }

//Перебор коллекции в обратном порядке
        System.out.println("\nВывод в обраном порядке");
        while (listIterator.hasPrevious()) {
            String s = listIterator.previous();
            System.out.print(s + " ");
        }
    }
    static void forEach() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(4);
        int sum = 0;
        System.out.print("Вывод коллекции: ");
        for (int i: list) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nСумма = " + sum);
    }
    static void splIteraris() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(5.0);
        list.add(6.0);
        list.add(4.0);
        System.out.print("Вывод коллекци\n");
        Spliterator<Double> spl = list.spliterator();
        while (spl.tryAdvance((n)-> System.out.println(n + " = " + Math.sqrt(n))));

    }
}
