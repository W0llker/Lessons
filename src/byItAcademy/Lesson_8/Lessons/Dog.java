package byItAcademy.Lesson_8.Lessons;
/*
В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
 */
public class Dog extends Animal{
    private String nameDog;
    private String breed;
    private int weight;

    public Dog(String color, int lifeExpectancy, String eat,String nameDog, String breed, int weight) {
        super(color, lifeExpectancy, eat);
        this.nameDog = nameDog;
        this.breed = breed;
        this.weight = weight;
    }

    public void bark() {
        System.out.println(nameDog + " лаяет");
    }
    public void bite() {
        System.out.println(nameDog + " кусает");
    }
    public void run() {
        System.out.println(nameDog + " бежит");
    }
    public void play() {
        System.out.println(nameDog + " играет");
    }
    public void jump() {
        System.out.println(nameDog + " прыгает");
    }

    @Override
    public String toString() {
        return  "nameDog='" + nameDog + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight + super.toString();
    }
}
