package byItAcademy.Lesson_10.Lesson;

/*
У строителя к примеру будут поля: модель, потребляемая мощность,
блок питания модель, страна производитель, агрегат для строительства,
материал
 */
public class Builder implements Robot, RobotEngineer {
    private String model;
    private int powerСonsumption;
    private String agregat;
    private String material;
    private int quality;
    private boolean isOn;

    @Override
    public Robot createRobot(String model, int powerСonsumption, String agregat) {
        System.out.println("Робот строитель создан");
        this.model = model;
        this.powerСonsumption = powerСonsumption;
        quality = 100;
        this.agregat = agregat;
        material = "метал";
        isOn = false;
        return this;
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
                    case "Кирка":
                        System.out.println("робот строитель что то делает киркой");
                        break;
                    case "Лопата":
                        System.out.println("робот строитель копает яму лопатой");
                        break;
                    default:
                        System.out.println("Робот строитель помогает строить дома");
                        break;
                }
                quality -= 25;
            }
        } else System.out.println("Робот строитель выключен");
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот строитель отремонтирован");
        quality = 100;
    }

    @Override
    public void changeMainAgregat(String agregat) {
        if (isOn) {
            System.out.println("Робот строитлель включен, замена агрегата невозможна");
        } else {
            System.out.println("Агрегат заменен");
            this.agregat = agregat;
        }
    }

    @Override
    public void onRobot() {
        System.out.println("Робот строитлель включен");
        isOn = true;
    }

    @Override
    public void offRobot() {
        System.out.println("Робот строитлель выключен");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "model='" + model + '\'' +
                ", powerСonsumption=" + powerСonsumption +
                ", unit='" + agregat + '\'' +
                ", material='" + material + '\'' +
                ", isSwich=" + isOn +
                '}';
    }
}
