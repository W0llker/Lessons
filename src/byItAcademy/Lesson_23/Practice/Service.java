package byItAcademy.Lesson_23.Practice;

public class Service {
    private void push() {
        System.out.println("Волк нету");
    }
    @Example
    private void getAnnotation() {
        System.out.println("Зайчик прыгает");
    }
    @Example
    private void serviceAnnotation() {
        System.out.println("Зайчик ушел за куст");
    }
}
