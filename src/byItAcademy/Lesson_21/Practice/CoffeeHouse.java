package byItAcademy.Lesson_21.Practice;

import byItAcademy.Lesson_21.Practice.Class.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeHouse {
    private List<Coffee> coffeeList;
    private static CoffeeHouse coffeeHouse;

    private CoffeeHouse() {
        coffeeList = new ArrayList<>();
    }
    public void addCoffee(Coffee coffee) {
        coffeeList.add(coffee);
    }
    public static CoffeeHouse getInstans() {
        if(coffeeHouse == null) {
            coffeeHouse = new CoffeeHouse();
        }
        return coffeeHouse;
    }

}
