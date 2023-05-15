package byItAcademy.Lesson_16.Lesson;

import java.util.ArrayList;
import java.util.List;

public class TheadPractice implements Runnable {
    @Override
    public void run() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add((int) (Math.random() * 10));
        }
        int summ = 0;
        for (Integer i : integerList) {
            summ+= i;
        }
        System.out.println("Среднее арифметическое " + summ/integerList.size() + " Поток " + Thread.currentThread().getName());
    }
}
