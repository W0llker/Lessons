package byItAcademy.Lesson_17.HomeWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
1.Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10 секунд,
результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков.
Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */
public class Main {
    public static void main(String[] args) {
        CollectionCallable callable = new CollectionCallable("Поток 1");
        CollectionCallable callable1 = new CollectionCallable("Поток 2");
        CollectionCallable callable2 = new CollectionCallable("Поток 3");
        CollectionCallable callable3 = new CollectionCallable("Поток 4");
        CollectionCallable callable4 = new CollectionCallable("Поток 5");
        CollectionCallable callable5 = new CollectionCallable("Поток 6");
        CollectionCallable callable6 = new CollectionCallable("Поток 7");
        CollectionCallable callable7 = new CollectionCallable("Поток 8");
        CollectionCallable callable8 = new CollectionCallable("Поток 9");
        CollectionCallable callable9 = new CollectionCallable("Поток 10");

        ExecutorService executors = Executors.newFixedThreadPool(3);
        Future<String> future = executors.submit(callable);
        Future<String> future1 = executors.submit(callable1);
        Future<String> future2 = executors.submit(callable2);
        Future<String> future3 = executors.submit(callable3);
        Future<String> future4 = executors.submit(callable4);
        Future<String> future5 = executors.submit(callable5);
        Future<String> future6 = executors.submit(callable6);
        Future<String> future7 = executors.submit(callable7);
        Future<String> future8 = executors.submit(callable8);
        Future<String> future9 = executors.submit(callable9);

        try{
            String result = future.get();
            System.out.println(result);

            result = future1.get();
            System.out.println(result);

            result = future2.get();
            System.out.println(result);

            result = future3.get();
            System.out.println(result);

            result = future4.get();
            System.out.println(result);

            result = future5.get();
            System.out.println(result);

            result = future6.get();
            System.out.println(result);

            result = future7.get();
            System.out.println(result);

            result = future8.get();
            System.out.println(result);

            result = future9.get();
            System.out.println(result);

        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executors.shutdown();
        }
    }
}
