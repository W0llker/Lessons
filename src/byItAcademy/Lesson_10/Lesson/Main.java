package byItAcademy.Lesson_10.Lesson;

/*
2. Создать роботов
3. Создать выставку роботов. Добавить туда роботов
4. Добавить в интерфейс робота метод демонстрация способностей.
Реализовать метод во всех трёх роботах (робот повар к примеру готовит,
строитель-строит, сапёр минирует)
5. Продемонстрировать способности всех роботов на выставке
6. Создать интерфейс РоботИнженер
7. Робот сапёр и робот строитель, должны быть также
Роботами инженерами (заимплементировать интерфейс Робот инженер)
8. Продемонстрировать на выставке поведение только Роботов инженеров
в 8 пункте используйте метод instanceOf
 */
public class Main {
    public static void main(String[] args) {
        Exhibition exhibition = addRobotEx();
        exhibition.activiteRobot();
        exhibition.activiteRobotEnginer();
        exhibition.activiteRobotSapper();
    }

    public static Exhibition addRobotEx() {
        Exhibition exhibition = new Exhibition();
        exhibition.addRobot(new Cook().createRobot("Мр97-04", 145, "Нож"));
        exhibition.addRobot(new Cook().createRobot("Нм98-01", 132, "Сковорода"));
        exhibition.addRobot(new Cook().createRobot("На583-06", 132, "Ящик"));
        exhibition.addRobot(new Builder().createRobot("PZ34-02", 123, "Кирка"));
        exhibition.addRobot(new Builder().createRobot("PВ3-42", 250, "Лопата"));
        exhibition.addRobot(new Builder().createRobot("P4", 243, "Кирпич"));
        exhibition.addRobot(new Sapper().createRobot("Pf15", 400, "Мина"));
        exhibition.addRobot(new Sapper().createRobot("АВ15", 350, "Граната"));

        exhibition.addRobotEngineer(new Builder().createRobot("PZ34-02", 123, "Кирка"));
        exhibition.addRobotEngineer(new Builder().createRobot("PВ3-42", 250, "Лопата"));
        exhibition.addRobotEngineer(new Sapper().createRobot("Pf15", 400, "Мина"));

        exhibition.addRobotSapper(new Sapper().createRobot("АВ15", 350, "Граната"));
        exhibition.addRobotSapper(new Sapper().createRobot("Pf15", 400, "Мина"));
        return exhibition;
    }
}
