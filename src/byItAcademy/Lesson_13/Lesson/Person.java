package byItAcademy.Lesson_13.Lesson;

public class Person<T> {
    T t;

    public Person(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Person{" +
                "t=" + t +
                '}';
    }
}
