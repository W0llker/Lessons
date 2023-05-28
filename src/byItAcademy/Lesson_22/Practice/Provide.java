package byItAcademy.Lesson_22.Practice;

public interface Provide {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String message);
}
