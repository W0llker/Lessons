package byItAcademy.Lesson_8.Lessons;

/*
Создать класс Зоопарк животных, в котором будут жить наши животные. В нем определить массив животных, которые будут проживать в этом зоопарк.
Добавить в этот зоопарк по три собаки и по три птицы. (необходимо определить метод, который будет добавлять животное в зоопарк.
Вывести в консоль количество добавленных животных. Созданный метод, должен возвращать новый класс зоопарк.
 */
public class Zoo {
    private Animal[] an = new Animal[20];
    private int count = 0;

    public void addAnimal(Animal a) {
        an[count] = a;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void animals() {
        System.out.println("Количество животных в зоопарке = " + count);
    }

    public void informationZoo() {
        for (Animal a : an) {
            if (a != null) {
                System.out.println(a.toString());
            }
        }
    }
}
