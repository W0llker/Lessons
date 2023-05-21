package byItAcademy.Lesson_21.Practice.Class;

import byItAcademy.Lesson_21.Practice.Class.Coffee;

public class Сappuccino implements Coffee {
    private int water;
    private int milk;
    private int sugar;

    public Сappuccino(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }

    @Override
    public void addSugar(int i) {
        System.out.println("Добавление сахара в Cappucino");
        sugar = i;
        System.out.println("Добавлено " + sugar + " куска сахара");
    }
}
