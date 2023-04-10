package byItAcademy.Lesson_10.Practice.enums;

public class Animal1 {
    private AnimalByType animalType;

    public AnimalByType getAnimalType() {
        return animalType;
    }

    public Animal1(AnimalByType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                '}';
    }
}
