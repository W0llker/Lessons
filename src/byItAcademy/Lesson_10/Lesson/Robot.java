package byItAcademy.Lesson_10.Lesson;

/*
Создать робота, отремонтировать робота,
заменить основной агрегат, включить робота, выключить.
 */
public interface Robot {
    Robot createRobot(String model, int powerСonsumption, String agregat);

    void repairRobot();

    void uniquePossibility();

    void changeMainAgregat(String agreagt);

    void onRobot();

    void offRobot();

}
