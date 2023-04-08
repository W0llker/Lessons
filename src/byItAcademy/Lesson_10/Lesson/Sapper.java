package byItAcademy.Lesson_10.Lesson;

/*
У сапёра к примеру будут поля: модель, потребляемая мощность,
средство для разминирования (шасси номер), материал
 */
public class Sapper implements Robot, RobotEngineer {
    private String model;
    private int powerСonsumption;
    private String agregat;
    private String material;
    private boolean isOn;
    private int quality;

    @Override
    public Robot createRobot(String model, int powerСonsumption, String agregat) {
        System.out.println("Робот сапер создан");
        this.model = model;
        this.powerСonsumption = powerСonsumption;
        quality = 100;
        this.agregat = agregat;
        material = "метал";
        isOn = false;
        return this;
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот сапер отремонтирован");
        quality = 100;
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            if (quality == 0) {
                System.out.println("Робот поломан");
                offRobot();
                repairRobot();
            } else {
                switch (agregat) {
                    default:
                        System.out.println("Робот сапер разменирует (даже хз что тут может быть)");
                        break;
                }
                quality -= 25;
            }
        } else System.out.println("Робот сапер выключен");
    }

    @Override
    public void changeMainAgregat(String agregat) {
        if (isOn) {
            System.out.println("Робот сапер включен, замена агрегата невозможна");
        } else {
            System.out.println("Агрегат заменен");
            this.agregat = agregat;
        }
    }

    @Override
    public void onRobot() {
        System.out.println("Робот сапер включен");
        isOn = true;
    }

    @Override
    public void offRobot() {
        System.out.println("Робот сапер выключен");
        isOn = false;
    }

    @Override
    public String toString() {
        return "Sapper{" +
                "model='" + model + '\'' +
                ", powerСonsumption=" + powerСonsumption +
                ", agregat='" + agregat + '\'' +
                ", material='" + material + '\'' +
                ", isOn=" + isOn +
                ", quality=" + quality +
                '}';
    }
}
