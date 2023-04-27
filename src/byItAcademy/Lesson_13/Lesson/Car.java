package byItAcademy.Lesson_13.Lesson;

import java.util.Comparator;

public class Car  implements Product  {
    private String model;
    private Integer price;
    private String name;

    public Car(String model, Integer price, String name) {
        this.model = model;
        this.price = price;
        this.name = name;
    }


    @Override
    public Integer getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
