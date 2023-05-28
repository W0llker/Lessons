package byItAcademy.Lesson_21.Practice.Class;

public class Espresso implements Coffee {
    private int water;
    private int sugar;

    @Override
    public void addSugar(int sugar) {
        System.out.println("Добавление сахара в Espresso");
        sugar += sugar;
        System.out.println("Добавлено " + sugar + " куска сахара");
    }

    public Espresso(int water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "water=" + water +
                ", sugar=" + sugar +
                '}';
    }
}
