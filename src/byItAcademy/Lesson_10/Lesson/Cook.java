package byItAcademy.Lesson_10.Lesson;

/*
У робота к повару к примеру будут поля: модель, потребляемая мощность,
блок питания модель,страна производитель,
агрегат для приготовления номер запчасти, материал
 */
public class Cook implements Robot {
    private String model;
    private int powerСonsumption;
    private String countryMade;
    private String agregat;
    private boolean isOn;
    private int quality;
    @Override
    public void uniquePossibility() {
        if(isOn) {
            if (quality == 0) {
                System.out.println("Робот поломан");
                offRobot();
                repairRobot();
            } else {
                switch (agregat) {
                    case "Нож":
                        System.out.println("робот повар режит овощи");
                        break;
                    case "Сковорода":
                        System.out.println("робот повар жарит на сковороде");
                        break;
                    default:
                        System.out.println("Робот повар несет ингредиенты");
                        break;
                }
                quality -= 25;
            }
        }else System.out.println("Робот повар выключен");
    }

    @Override
    public Robot createRobot(String model, int powerСonsumption, String agregat) {
        System.out.println("Робот повар создан");
        this.model = model;
        this.powerСonsumption = powerСonsumption;
        quality = 100;
        this.agregat = agregat;
        countryMade = "Россия";
        isOn = false;
        return this;
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот повар отремонтирован");
        quality = 100;
    }

    @Override
    public void changeMainAgregat(String agregat) {
        if (isOn) {
            System.out.println("Робот повар включен, замена агрегата невозможна");
        } else {
            System.out.println("Агрегат заменен");
            this.agregat = agregat;
        }
    }

    @Override
    public void onRobot() {
        System.out.println("Робот повар включен");
        isOn = true;
    }

    @Override
    public void offRobot() {
        System.out.println("Робот повар выключен");
        isOn = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerСonsumption() {
        return powerСonsumption;
    }

    public void setPowerСonsumption(int powerСonsumption) {
        this.powerСonsumption = powerСonsumption;
    }

    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }

    public String getAgregat() {
        return agregat;
    }

    public void setAgregat(String agregat) {
        this.agregat = agregat;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "model='" + model + '\'' +
                ", powerСonsumption=" + powerСonsumption +
                ", countryMade='" + countryMade + '\'' +
                ", agregat='" + agregat + '\'' +
                ", isSwich=" + isOn +
                ", quality=" + quality +
                '}';
    }
}
