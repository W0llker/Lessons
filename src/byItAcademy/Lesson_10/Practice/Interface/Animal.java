package byItAcademy.Lesson_10.Practice.Interface;

public interface Animal {
    String predator = "Хищник";
    String notPredator = "Травоядный";
    void move();
    String getType();
    default void sound(String type) {
        if(isPredator(type)) {
            System.out.println("Рык");
        } else System.out.println("Писк");
    }
    private boolean isPredator(String type) {
        return type.equals(predator);
    }
}
