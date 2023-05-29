package myExample.Executers;

import java.util.concurrent.CountDownLatch;

public class ThreadTest extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public ThreadTest(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            countDownLatch.countDown();
        }
    }
}
