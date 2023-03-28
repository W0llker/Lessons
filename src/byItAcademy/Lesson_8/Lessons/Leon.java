package byItAcademy.Lesson_8.Lessons;



public class Leon extends Animal{

    public Leon(String color, int lifeExpectancy, String eat) {
        super(color, lifeExpectancy, eat);
    }


    public void sleep() {
        System.out.println(getColor() + " Лев спит");
    }


    public void play() {
        System.out.println(getColor() + " Лев играет");
    }


    public void sounds() {
        System.out.println(getColor() + " Лев рычит");
    }

    public String toString() {
        return "Лев" + super.toString();
    }
}
