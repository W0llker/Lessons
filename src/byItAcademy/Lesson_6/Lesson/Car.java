package byItAcademy.Lesson_6.Lesson;

public class Car {
    long maxSpeed;
    int consumption;
    String marka;
    String color;

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", consumption=" + consumption +
                ", marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
