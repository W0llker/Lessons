package byItAcademy.Lesson_21.Practice.Class;

import byItAcademy.Lesson_21.Practice.Class.Coffee;

public class Latte implements Coffee {
    private int water;
    private int milk;
    private int sugar;

    @Override
    public void addSugar(int i) {
        System.out.println("Добавление сахара в Latte");
        sugar = i;
        System.out.println("Добавлено " + sugar + " куска сахара");
    }

    public Latte(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }
}
