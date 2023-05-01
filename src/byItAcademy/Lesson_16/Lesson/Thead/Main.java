package byItAcademy.Lesson_16.Lesson.Thead;

public class Main {
    public static void main(String[] args) {
//        theadNumber1();
//        theadFile();
    }
    public static void theadFile() {
        Thread thread = new Thread(new TheadFile("number1"),"1");
        Thread thread1 = new Thread(new TheadFile("number2"),"2");
        Thread thread2 = new Thread(new TheadFile("number3"),"3");
        Thread thread3 = new Thread(new TheadFile("number4"),"4");

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public static void theadNumber1() {
        Thread thread = new Thread(new TheadPc(), "1");
        Thread thread1 = new Thread(new TheadPc(), "2");
        Thread thread2 = new Thread(new TheadPc(), "3");
        Thread thread3 = new Thread(new TheadPc(), "4");

        try {
            thread.start();
            thread.join();

            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
