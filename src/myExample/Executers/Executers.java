package myExample.Executers;

import java.util.concurrent.*;

public class Executers {
    public static void main(String[] args) {
        CountDownLatch cl = new CountDownLatch(5);
        CountDownLatch cl1 = new CountDownLatch(5);
        CountDownLatch cl2 = new CountDownLatch(5);
        CountDownLatch cl3 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);

        es.execute(new ThreadTest("F",cl));
        es.execute(new ThreadTest("C",cl1));
        es.execute(new ThreadTest("D",cl2));
        es.execute(new ThreadTest("S",cl3));

        ExecutorService ez = Executors.newFixedThreadPool(1);
        Future<Integer> future = ez.submit(new CalabbleMain());

        try {
            System.out.println(future.get());
            cl.await();
            cl1.await();
            cl2.await();
            cl3.await();
        } catch (Exception e) {
            e.getMessage();
        }
        es.shutdown();
    }
}
