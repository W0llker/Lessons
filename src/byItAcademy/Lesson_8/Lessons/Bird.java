package byItAcademy.Lesson_8.Lessons;
/*
Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
 */
public class Bird extends Animal {
    private String family;
    private int height;

    public Bird(String color, int lifeExpectancy, String eat, String family, int height) {
        super(color, lifeExpectancy, eat);
        this.family = family;
        this.height = height;
    }

    public void singing() {
        System.out.println(family + " поет");
    }


    public void pecking() {
        System.out.println(family + " клюет");
    }
    public void incubate() {
        System.out.println(family + " высижывает птенцов");
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "family='" + family + '\'' +
                ", height=" + height + super.toString();
    }
}
