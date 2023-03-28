package byItAcademy.Lesson_8.Practice;

public class Transport {
    private String color;
    int maxSpeed;
    //плавает летает едет
    public String type;
    public int weight;
    public Transport() {

    }

    public Transport(String color, int maxSpeed, String type, int weight) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    public void processGo() {
        System.out.println("Транспорт движется");
    }
}
