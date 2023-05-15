package byItAcademy.Lesson_17.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CollectionCallable implements Callable<String> {
    private String name;

    public CollectionCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName(name);
        List<Integer> list = initialization();
        Thread.sleep(5000);
        return Thread.currentThread().getName() + " " + amountToCollection(list);
    }
    public static List<Integer> initialization() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 25));
        }
        return list;
    }
    public String amountToCollection(List<Integer> list) {
        int result = 0;
        for (Integer a : list) {
            result += a;
        }
        return String.valueOf(result);
    }
}
