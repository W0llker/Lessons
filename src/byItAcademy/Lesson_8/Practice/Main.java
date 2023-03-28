package byItAcademy.Lesson_8.Practice;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport("Коричневый", 150, "Летит",180);
        Car car = new Car("Коричневый", 150, "Летит",180,"b","tyota",4);
        car.processGo();
    }
}
