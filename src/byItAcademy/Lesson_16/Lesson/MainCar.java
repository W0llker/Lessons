package byItAcademy.Lesson_16.Lesson;

public class MainCar {
    public static void main(String[] args) {
        Thread thread = new Thread(new Car("BMW",1000),"BMW");
        Thread thread1 = new Thread(new Car("Volga",1500),"Volga");

        thread.start();
        thread1.start();
    }
}
