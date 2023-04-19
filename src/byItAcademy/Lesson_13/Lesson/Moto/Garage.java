package byItAcademy.Lesson_13.Lesson.Moto;

public class Garage <T extends Vehicle>{
    T t;

    public Garage(T t) {
        this.t = t;
    }

    public void information() {
        System.out.println(t);
    }
}
