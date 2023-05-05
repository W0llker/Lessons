package byItAcademy.Lesson_18.Lesson.Zadanie2;

import java.util.concurrent.Semaphore;

/*
2. На маршруте несколько остановок. На одной
остановке может останавливаться несколько автобусов одновременно, но не более заданного числа. (Семафоры)
 */
public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread thread = new Thread(new Buses("N35",semaphore),"Поток 1");
        Thread thread1 = new Thread(new Buses("N17",semaphore),"Поток 2");
        Thread thread2 = new Thread(new Buses("N20",semaphore),"Поток 3");
        Thread thread3 = new Thread(new Buses("N62",semaphore),"Поток 4");

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
