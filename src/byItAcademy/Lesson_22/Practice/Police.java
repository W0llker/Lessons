package byItAcademy.Lesson_22.Practice;

import java.util.ArrayList;
import java.util.List;

public class Police implements Provide{
    private static Police police;
    private List<Observer> observerList;

    private Police() {
        this.observerList = new ArrayList<>();
    }
    public static Police getInstance() {
        if(police == null) {
            police = new Police();
        }
        return police;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver(String message) {
        observerList.forEach(observer -> observer.notification(message));
    }
}
