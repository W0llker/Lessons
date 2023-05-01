package byItAcademy.Lesson_16.Practice;

public class MultiCooker extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Готовит еду " + i);
        }
    }
}
