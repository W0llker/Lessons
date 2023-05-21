package byItAcademy.Lesson_21.Practice;

import byItAcademy.Lesson_21.Practice.Class.*;

public class FabrikeTest implements FabriceCoffe {
    @Override
    public Coffee createCoffee(ViewCoffee viewCoffee, int water, int milk) {
        Coffee coffee = null;
        if (viewCoffee == ViewCoffee.AMERICANO) {
            coffee = new Americano(water, milk);
        } else if (viewCoffee == ViewCoffee.CAPPUCCINO) {
            coffee = new Сappuccino(water, milk);
        } else if (viewCoffee == ViewCoffee.ESPRESSO) {
            coffee = new Espresso(water);
        } else if (viewCoffee == ViewCoffee.LATTE) {
            coffee = new Latte(water,milk);
        }
        return coffee;
    }
}
