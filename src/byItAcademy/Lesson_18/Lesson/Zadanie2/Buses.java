package byItAcademy.Lesson_18.Lesson.Zadanie2;

import java.util.concurrent.Semaphore;

public class Buses implements Runnable{
    private String name;
    private Semaphore semaphore;
    public Buses(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            busStop();
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void busStop() {
        System.out.println("Автобус " + name + " остановился на остановке");
        for (int i = 1; i < 4; i++) {
            System.out.println("Пассажир " + i + " зашел в автобус " + name);
        }
        System.out.println("Автобус " + name + " уехал");
    }
}
