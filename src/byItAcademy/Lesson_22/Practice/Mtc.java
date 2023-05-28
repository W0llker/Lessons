package byItAcademy.Lesson_22.Practice;

public class Mtc implements Observer {
    @Override
    public void notification(String message) {
        System.out.println("Отправляет предупреждение всем абонентам Mtc <" + message + ">");
    }
}
