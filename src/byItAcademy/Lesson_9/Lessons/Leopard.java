package byItAcademy.Lesson_9.Lessons;

public class Leopard extends Predator {
    private String name;

    public Leopard() {

    }

    public Leopard(String name) {
        this.name = name;
    }

    public Leopard(String inhabitancy, int maxSpeed, String color, String name) {
        super(inhabitancy, maxSpeed, color);
        this.name = name;
    }

    @Override
    public void sounds() {

    }

    @Override
    public void run() {

    }

    @Override
    public void hunt() {
        System.out.println("леопард догоняет жертву");
    }

    @Override
    public String toString() {
        return "Leopard " +
                "name='" + name + '\'' + super.toString();
    }
}
