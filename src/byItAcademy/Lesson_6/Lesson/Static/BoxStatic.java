package byItAcademy.Lesson_6.Lesson.Static;

// параллелепипед
public class BoxStatic {
    public final static int lenght;
    public static int wight;
    public static int height;

    static {
        lenght = 3;
        wight = 5;
        height = 2;
    }

    public void calculateSquare() {
        int a = lenght * wight;
        System.out.println(a);
    }

    static int calculateSquar() {
        return lenght * wight;
    }
}
