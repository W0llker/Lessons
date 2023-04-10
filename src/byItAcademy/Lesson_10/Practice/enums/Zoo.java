package byItAcademy.Lesson_10.Practice.enums;

public class Zoo {
    private Animal1[] animals = new Animal1[0];

    public Zoo(Animal1[] animals) {
        this.animals = animals;
    }
    public Animal1[] getAnimalsByType(AnimalByType animalType) {
        Animal1[] animalByType = new Animal1[animals.length];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getAnimalType().equals(animalType)) {
                animalByType[i] = animals[i];
            }
        }
        return animalByType;
    }
}
