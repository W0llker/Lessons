package byItAcademy.Lesson_22.Practice;

public class Life implements Observer {
    @Override
    public void notification(String message) {
        System.out.println("Обзванивает всех клиентов Life и говорит " + message);
    }
}
