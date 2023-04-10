package byItAcademy.Lesson_9.Lessons;

public class Leon extends Predator {
    private String name;

    public Leon() {

    }

    public Leon(String name) {
        this.name = name;
    }

    public Leon(String inhabitancy, int maxSpeed, String color, String name) {
        super(inhabitancy, maxSpeed, color);
        this.name = name;
    }

    @Override
    public void hunt() {
        System.out.println("Лев прыгает на жертву из кустов");
    }

    @Override
    public void sounds() {
        System.out.println("Лев идет куда то");
    }

    @Override
    public void run() {
        System.out.println("Лев побежал куда то");
    }

    @Override
    public String toString() {
        return "Leon " +
                "name='" + name + '\'' + super.toString();
    }
}
