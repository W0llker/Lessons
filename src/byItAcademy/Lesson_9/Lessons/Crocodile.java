package byItAcademy.Lesson_9.Lessons;

public class Crocodile extends Predator{
    private String type;
    public Crocodile() {

    }
    public Crocodile(String type) {
        this.type = type;
    }

    public Crocodile(String inhabitancy, int maxSpeed, String color, String type) {
        super(inhabitancy, maxSpeed, color);
        this.type = type;
    }

    @Override
    public void hunt() {
        System.out.println("крокодил прыгает на жертву");
    }

    @Override
    public void sounds() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Crocodile " +
                "type='" + type + '\'' + super.toString();
    }
}
