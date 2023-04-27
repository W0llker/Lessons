package byItAcademy.Lesson_13.Practice.genericextends;

public interface Animal {
    AnimalType getType();
    default void sound() {
        if (getType() == AnimalType.Predator) {
            System.out.println("Рык");
        } else {
            System.out.println("Писк");
        }
    }
    void hello();
}
