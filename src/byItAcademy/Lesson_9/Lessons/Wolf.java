package byItAcademy.Lesson_9.Lessons;




public class Wolf extends Predator{
    @Override
    public void sounds() {
        System.out.println("Волк скулит");
    }

    @Override
    public void run() {
        System.out.println("Волк ползет");
    }

    @Override
    public void hunt() {
        System.out.println("волк окружает жертву");
    }
    @Override
    public String toString() {
        return "Wolf";
    }
}
