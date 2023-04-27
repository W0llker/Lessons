package byItAcademy.Lesson_13.Lesson;
/*
1.Создать параметризованный класс. Реализовать в нём метод toString.
Создать сначала объект этого класса, который будет принимать String, затем Integer.
Вызвать соответствующий метод toString.
2.	Создать интерфейс товар. В нём пусть будет метод вернуть цену (возвращаемый тип Integer).
2.1	 Создать параметризованный класс (Сравнение товаров) из двух типов.
Оба типа будут возвращать информацию о цене, следовательно оба будут наследоваться от товара.
Вывести всё информацию о двух классах.
2.2	В параметризованном классе выполнить сравнение цены двух товаров.
2.3	Создать классы Автомобиль (поля модель, цена, полное название)
мотоцикл(наименование, цена, объём двигателя).
Оба должны наследоваться от интерфейса Товар
2.4	Выполнить сравнение двух товаров с использованием ранее созданного парметризованного класса.

3. Создать классы Car и Motorcycle, которые наследуются от общего класса
Vehicle. Создать поле name в классе Vehicle и проинициализировать его через
конструктора. Создать generic класс Garage, который может хранить только объекты
типа наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
клавиатуры) и вывести на экран имя хранимого транспортного средства.
*/

public class Main {
    public static void main(String[] args) {
        Person<String> person = new Person<>("Человек");
        System.out.println(person);

        Person<Integer> person1 = new Person<>(1);
        System.out.println(person1);
        productTest();
    }
    public static void productTest() {
        Car car = new Car("BC34",134,"BC34");
        Bike bike = new Bike("BC34",235,150);
        ComparisonProduct<Car,Bike> comparisonProduct = new ComparisonProduct<>(car,bike);
        comparisonProduct.information();
        comparisonProduct.compare();
        System.out.println(comparisonProduct.compareTo(car,bike));
    }
}
