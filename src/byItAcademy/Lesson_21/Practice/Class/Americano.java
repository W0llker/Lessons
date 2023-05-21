package byItAcademy.Lesson_21.Practice.Class;

public class Americano implements Coffee {
    private int water;
    private int milk;
    private int sugar;

    @Override
    public void addSugar(int i) {
        System.out.println("Добавление сахара в Americano");
        sugar = i;
        System.out.println("Добавлено " + sugar + " куска сахара");
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public Americano(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }
}
