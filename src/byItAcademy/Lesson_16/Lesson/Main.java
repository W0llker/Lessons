package byItAcademy.Lesson_16.Lesson;
/*
1.Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции
из 10 случайных целых чисел и выводит на экран.
2.	Создать класс авто. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
2.1	Создать два потока (две машины которые будут ехать параллельно).
2.2	Дать возможность каждой машине останавливаться на определённое время. Передавать в конструктор параметр по остановке, которое будет записываться в поле. В последствии поток будет спать переданное время.
2.3	Сделать задачу 2.1 и 2.2 через интерфейс Runnable.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TheadPractice(),"1");
        Thread thread1 = new Thread(new TheadPractice(),"2");
        Thread thread2 = new Thread(new TheadPractice(),"3");
        Thread thread3 = new Thread(new TheadPractice(),"4");
        Thread thread4 = new Thread(new TheadPractice(),"5");
        Thread thread5 = new Thread(new TheadPractice(),"6");
        Thread thread6 = new Thread(new TheadPractice(),"7");
        Thread thread7 = new Thread(new TheadPractice(),"8");
        Thread thread8 = new Thread(new TheadPractice(),"9");
        Thread thread9 = new Thread(new TheadPractice(),"10");


        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
