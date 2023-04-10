package byItAcademy.Lesson_10.Practice.Interface;

public class Main {
    public static void main(String[] args) {
        Predator lion = new Lion("Хищник");
        Mouse mouse = new Mouse("Травоядный");
        lion.sound(lion.getType());
        Predator.Cat leopard = new Leopard();
        leopard.murlicat();
    }
}
