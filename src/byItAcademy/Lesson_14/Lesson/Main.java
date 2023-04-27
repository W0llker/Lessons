package byItAcademy.Lesson_14.Lesson;
/*
1.	Создать интерфейс Поезд (AbstractTrain).
Создать класс поезд. Определить в нём поля: номер поезда, маршрут,
расстояние между городами по маршруту, статус (в пути, загружается, разгружается),
количество литров в баке, расход на 100 км, загруженность (Enum: загружен, пустой).
2.	Определить методы в интрфейсе заправка, отправление, смена статуса, разгрузка.
3.	Реализовать метод заправка (просто прибавить залить  топливо в бак и сложить)
4.	Отправление (произвести проверку, если до конечной точки маршрута не хватит топлива в баке,
то выбросить своё собственное исключение.
5.	Реализовать методы загрузка и разгрузка. При этом, если статус в пути, то мы не можем выполнять загрузку или разгрузки.
 Выбросить своё исключение.
6.	Если мы хотим загрузиться, а поезд полон, то выбрасываем исключение.
7.	Если мы хотим разгрузиться, а поезд пустой, то выбрасываем исключение.
 */

public class Main {
    public static void main(String[] args) {
        AbstractTrain train = new Train(2,"Москва-Беларусь",250,150,10);
        train.loading();
        train.departure();
        train.changeStatus();
        train.unloading();
    }
}