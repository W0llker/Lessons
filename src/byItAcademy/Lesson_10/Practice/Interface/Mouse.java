package byItAcademy.Lesson_10.Practice.Interface;

public class Mouse implements Animal {
    private String type;

    public Mouse(String type) {
        this.type = type;
    }

    @Override
    public void move() {
        System.out.println("Бежит и крадется");
    }

    public void eat() {

    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
