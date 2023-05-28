package byItAcademy.Lesson_22.Practice;

public class Velcome implements Observer {
    @Override
    public void notification(String message) {
        System.out.println("Отправляет смски всем абонентам велком <" + message + ">");
    }
}
