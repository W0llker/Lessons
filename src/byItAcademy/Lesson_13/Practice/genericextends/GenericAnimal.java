package byItAcademy.Lesson_13.Practice.genericextends;

public class GenericAnimal {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(AnimalType.NotPredator);
        AnimalGeneric<Mouse> mouseAnimalGeneric = new AnimalGeneric<>(mouse);
    }
}
