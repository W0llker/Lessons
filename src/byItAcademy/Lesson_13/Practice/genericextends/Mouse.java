package byItAcademy.Lesson_13.Practice.genericextends;

public class Mouse implements Animal {
    private AnimalType animalType;

    public Mouse(AnimalType animalType) {
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
