package byItAcademy.Lesson_9.Lessons;

public class Shake extends Predator {
    private String type;

    public Shake() {
    }

    public Shake(String type) {
        this.type = type;
    }

    public Shake(String inhabitancy, int maxSpeed, String color, String type) {
        super(inhabitancy, maxSpeed, color);
        this.type = type;
    }

    @Override
    public void hunt() {

    }

    @Override
    public void sounds() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Shake " +
                "type='" + type + '\'' + super.toString();
    }
}
