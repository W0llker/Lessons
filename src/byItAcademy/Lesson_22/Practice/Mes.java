package byItAcademy.Lesson_22.Practice;

import java.util.ArrayList;
import java.util.List;

public class Mes implements Provide {
    public static Mes mes;
    List<Observer> observerList;

    private Mes() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        observerList.forEach(observer -> observer.notification(message));
    }

    public static Mes getInstans() {
        if (mes == null) {
            mes = new Mes();
        }
        return mes;

    }
}
