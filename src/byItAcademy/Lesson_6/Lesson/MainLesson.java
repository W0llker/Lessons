package byItAcademy.Lesson_6.Lesson;

public class MainLesson {
    public static void main(String[] args) {
//        Car geely = new Car();
//        geely.maxSpeed = 250;
//        geely.consumption = 8;
//        geely.marka = "Coolray";
//        geely.color = "Red";
//        System.out.println(geely);
//
//        Car mers = new Car();
//        mers.color = "yellow";
//        mers.maxSpeed = 320;
//        mers.consumption = 12;
//        mers.marka = "Benz";
//        System.out.println(mers);

        Person Vasia = new Person("Vasia","Petrov","Olegovich");
        Person Cemen = new Person("Cemen","Fog");
        Vasia.goToTheWork();
        Vasia.goToTheWork(true);
        Vasia.goToTheWork(false);
    }
}
