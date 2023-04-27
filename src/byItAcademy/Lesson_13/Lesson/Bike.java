package byItAcademy.Lesson_13.Lesson;

import java.util.Comparator;

public class Bike  implements Product {
    private String name;
    private Integer price;
    private Integer engineСapacity;

    public Bike(String name, Integer price, Integer engineСapacity) {
        this.name = name;
        this.price = price;
        this.engineСapacity = engineСapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(Integer engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", engineСapacity=" + engineСapacity +
                '}';
    }
}
