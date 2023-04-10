package byItAcademy.Lesson_10.Practice.enums;

public class Main {
    public static void main(String[] args) {
        Lion1 lion = new Lion1(AnimalByType.PREDATOR);
        Mouse1 mouse = new Mouse1(AnimalByType.PREDATOR);

        Animal1[] animal = new Animal1[2];
        animal[0] = lion;
        animal[1] = mouse;
        Zoo zoo = new Zoo(animal);

        Animal1[] animalTest = zoo.getAnimalsByType(AnimalByType.PREDATOR);
        for (Animal1 animal1 : animalTest) {
            System.out.println(animal1.getAnimalType().getDescription());
        }
    }
}
