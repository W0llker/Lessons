package byItAcademy.Lesson_13.Practice.genericextends;

public class Lion implements Animal {
    private AnimalType animalType;

    public Lion(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public AnimalType getType() {
        return null;
    }

    @Override
    public void hello() {

    }
}
