package byItAcademy.Lesson_8.Practice;

public class Car extends Transport {
    private String model;
    private String brand;
    private int countOfWheels;
    public Car(String color, int maxSpeed, String type, int weight, String model, String brand, int countOfWheels) {
        super(color, maxSpeed, type, weight);
        this.model = model;
        this.brand = brand;
        this.countOfWheels = countOfWheels;
    }

    @Override
    public void processGo() {
        System.out.println("Машина поехала");
    }
}
