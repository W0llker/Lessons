package byItAcademy.Lesson_13.Practice.genericextends;

public enum AnimalType {
    Predator("Хищник"),
    NotPredator("Не Хищник");
    private String name;

    AnimalType(String name) {
        this.name = name;
    }
}
