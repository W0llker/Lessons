package byItAcademy.Lesson_22.Practice;

public class Beltelecom implements Observer {
    @Override
    public void notification(String message) {
        System.out.println("обзванивает всех абонентов белтелеком с информацией " + message);
    }
}
