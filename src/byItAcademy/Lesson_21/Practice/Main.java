package byItAcademy.Lesson_21.Practice;

import byItAcademy.Lesson_21.Practice.Class.Coffee;

/*
1. Создать фабрику по созданию кофе (эспрессо, латте, американо, капучино).
При этом логика создания кофе зависит от таких ингридиентов как
(количество молока, количество воды, присутствие молока).
 */
public class Main {
    public static void main(String[] args) {
        FabrikeTest fabrikeTest = new FabrikeTest();
        Coffee coffee = fabrikeTest.createCoffee(ViewCoffee.CAPPUCCINO,200,150);
        coffee.addSugar(3);

        CoffeeHouse coffeeHouse = CoffeeHouse.getInstans();
        coffeeHouse.addCoffee(coffee);
    }
}
