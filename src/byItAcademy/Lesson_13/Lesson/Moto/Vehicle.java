package byItAcademy.Lesson_13.Lesson.Moto;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
