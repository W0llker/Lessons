package byItAcademy.Lesson_8.Lessons;
/*
1.1	Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
1.2	 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
1.3	Создать класс Зоопарк животных, в котором будут жить наши животные. В нем определить массив животных, которые будут проживать в этом зоопарк.
Добавить в этот зоопарк по три собаки и по три птицы. (необходимо определить метод, который будет добавлять животное в зоопарк.
Вывести в консоль количество добавленных животных. Созданный метод, должен возвращать новый класс зоопарк.
 */

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Черный", 25, "мясо","Коди","мопс",55);
        Bird bird = new Bird("Белый", 25, "мясо","Орел", 500);
        dog.bark();
        dog.play();
        dog.jump();
        bird.pecking();
        bird.singing();

        System.out.println("Зоопарк");
        Zoo zoo = new Main().addAnimal();
        zoo.animals();

        System.out.println("Лев");
        Leon l = new Leon("Белый",25,"мясо");
        Leon l2 = new Leon("Черный",25,"мясо");
        Leon l3 = new Leon("Рыжий",25,"мясо");
        l.play();
        l.sleep();

        zoo.addAnimal(l);
        zoo.addAnimal(l2);
        zoo.addAnimal(l3);
        zoo.animals();
        zoo.informationZoo();
        System.out.println("*****************************************");
        zoo.removeAnimal(6);
        zoo.animals();
        zoo.informationZoo();
    }
    public Zoo addAnimal(){
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Черный", 20, "мясо","Коди","бшо",35));
        zoo.addAnimal(new Dog("Рыжий", 8, "мясо","Чак","хуяхуя",4));
        zoo.addAnimal(new Dog("Белый", 12, "мясо","Геральт","мопс",8));
        zoo.addAnimal(new Bird("Белый", 22, "мясо","Орел", 500));
        zoo.addAnimal(new Bird("Серый", 22, "все","Голубь", 80));
        zoo.addAnimal(new Bird("Синий", 22, "все","Воробей", 120));
        return zoo;
    }
}
