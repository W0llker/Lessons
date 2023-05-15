package byItAcademy.Lesson_16.Lesson.Thead;

import java.util.*;
/*
Создать класс поток, который генерирует массив случайных целых чисел из
10 элементов, затем находит максимальный элемент, в этом массиве,
и выводит на экран в формате имя потока, максимальный элемент.
Запустить 10 потоков
 */

public class TheadPc implements Runnable {
    List<Integer> a = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            a.add((int) (Math.random() * 100));
        }
        System.out.println(toString());
        System.out.println("Махсимальное числов " + Collections.max(a) + " в потоке " + Thread.currentThread().getName());
    }

    public String toString() {
        return a.toString();
    }
}
