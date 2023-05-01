package byItAcademy.Lesson_16.Lesson;

public class Car implements Runnable {
    private String name;
    private long mili;

    public Car(String name, long mili) {
        this.name = name;
        this.mili = mili;
    }

    @Override
    public void run() {
        go();
    }

    public void go() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(mili);
                System.out.println(name + " маниша едет ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
