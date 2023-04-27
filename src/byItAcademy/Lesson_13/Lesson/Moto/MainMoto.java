package byItAcademy.Lesson_13.Lesson.Moto;

import java.util.Scanner;

/*
3. Создать классы Car и Motorcycle,
которые наследуются от общего класса
Vehicle. Создать поле name в классе Vehicle и
проинициализировать его через
конструктора.
Создать generic класс Garage, который может хранить только объекты
типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */
public class MainMoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage<Car> carGarage = new Garage<>(new Car(scanner.next()));
        carGarage.information();

        Garage<Motorcycle> garage = new Garage<>(new Motorcycle(scanner.next()));
        garage.information();
    }
}
