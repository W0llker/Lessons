package byItAcademy.Lesson_8.Practice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Коричневый", 150, "Летит",180,"b","tyota",4);
        car.processGo();
        Transport transport = new Car();
        Transport ship = new Ship();
        Transport plan = new Plain();
    }
}
