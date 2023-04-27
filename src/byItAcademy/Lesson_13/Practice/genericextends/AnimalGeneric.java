package byItAcademy.Lesson_13.Practice.genericextends;

public class AnimalGeneric<T extends Animal> {
    T animal;

    public AnimalGeneric(T animal) {
        this.animal = animal;
    }

    public void sound() {
        animal.sound();
        animal.hello();
    }

    public AnimalType getType() {
        return animal.getType();
    }
}
