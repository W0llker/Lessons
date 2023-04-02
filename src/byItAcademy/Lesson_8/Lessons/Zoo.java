package byItAcademy.Lesson_8.Lessons;

/*
Создать класс Зоопарк животных, в котором будут жить наши животные. В нем определить массив животных, которые будут проживать в этом зоопарк.
Добавить в этот зоопарк по три собаки и по три птицы. (необходимо определить метод, который будет добавлять животное в зоопарк.
Вывести в консоль количество добавленных животных. Созданный метод, должен возвращать новый класс зоопарк.
 */
public class Zoo {
    private Animal[] an = new Animal[0];
    public int idAnimal = 0;

    public void addAnimal(Animal a) {
        idAnimal++;
        a.setId(idAnimal);
        if (an.length == 0) {
            an = new Animal[1];
            an[0] = a;
        } else {
            Animal[] copyAnimal = new Animal[an.length + 1];
            for (int i = 0; i < copyAnimal.length; i++) {
                if (i == copyAnimal.length - 1) {
                    copyAnimal[i] = a;
                } else copyAnimal[i] = an[i];
            }
            an = copyAnimal;
        }
    }

    public void removeAnimal(int a) {
        boolean cheakAnimal = false;
        for (Animal animal : an) {
            if (animal.getId() == a) {
                cheakAnimal = true;
                break;
            }
        }
        if (cheakAnimal == true) {
            int j = 0;
            Animal[] copyAnimal = new Animal[an.length - 1];
            for (Animal animal : an) {
                if (animal.getId() != a) {
                    copyAnimal[j] = animal;
                    j++;
                }
            }
            an = copyAnimal;
        }
    }
    public void soundsAnimal() {
        for (Animal animal : an) {
            animal.sounds();
        }
    }

    public void animals() {
        System.out.println("Количество животных в зоопарке = " + an.length);
    }

    public void informationZoo() {
        for (Animal a : an) {
            System.out.println(a);
        }
    }
}
