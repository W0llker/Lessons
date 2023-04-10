package byItAcademy.Lesson_10.Practice.enums;

public enum AnimalByType {
    //Хищник
    PREDATOR("Хищник"),
    // Травоядный
    NOTPREDATOR("Травоядный");

    private String description;
    AnimalByType (String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
