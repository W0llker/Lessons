package byItAcademy.Lesson_10.Practice.Interface;

public class Lion implements Predator.Cat,Predator {
    private String type;

    @Override
    public void murlicat() {
        System.out.println("Мррррр");
    }

    public Lion(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("Бежит и бросается на жертву");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void hunting() {
        System.out.println("Лев охотитися");
    }
}
