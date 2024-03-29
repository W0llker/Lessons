package byItAcademy.Lesson_8.Lessons;

/*
Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения)
 */
public class Animal {
    private String color;
    private int lifeExpectancy;
    private String eat;
    private int id = 0;
    public Animal(String color, int lifeExpectancy, String eat) {
        this.color = color;
        this.lifeExpectancy = lifeExpectancy;
        this.eat = eat;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void sleep() {
        System.out.println("Животное Спит");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void sounds() {
        System.out.println("Животное издает звуки");
    }

    public void eating() {
        System.out.println("употребляет еду");
    }

    @Override
    public String toString() {
        return " id=" + id +
                ", color='" + color + '\'' +
                ", lifeExpectancy=" + lifeExpectancy +
                ", eat='" + eat + '\'';
    }
}
