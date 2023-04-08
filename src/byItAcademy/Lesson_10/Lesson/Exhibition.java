package byItAcademy.Lesson_10.Lesson;

import java.util.Scanner;

/*
Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
Вторая выставка- только для инженерных роботов.
Третья выставка- для роботов сапёров.
Продемонстрировать способности всех роботов,которые
 */
public class Exhibition {
    private Robot[] exhibition1 = new Robot[0];
    private Robot[] exhibition2 = new RobotEngineer[0];
    private Robot[] exhibition3 = new Sapper[0];

    public void addRobot(Robot robot) {
        if (exhibition1.length == 0) {
            exhibition1 = new Robot[1];
            exhibition1[0] = robot;
        } else {
            Robot[] copyRobot = new Robot[exhibition1.length + 1];
            for (int i = 0; i < copyRobot.length; i++) {
                if (i != copyRobot.length - 1) {
                    copyRobot[i] = exhibition1[i];
                } else copyRobot[i] = robot;
            }
            exhibition1 = copyRobot;
        }
    }

    public void addRobotEngineer(Robot robotEngineer) {
        if (robotEngineer instanceof RobotEngineer) {
            if (exhibition2.length == 0) {
                exhibition2 = new Robot[1];
                exhibition2[0] = robotEngineer;
            } else {
                Robot[] copyRobot = new Robot[exhibition2.length + 1];
                for (int i = 0; i < copyRobot.length; i++) {
                    if (i != copyRobot.length - 1) {
                        copyRobot[i] = exhibition2[i];
                    } else copyRobot[i] = robotEngineer;
                }
                exhibition2 = copyRobot;
            }
        } else {
            System.out.println("В эту выставку могу быть добавленны только роботы инженеры");
        }
    }

    public void addRobotSapper(Robot robotSapper) {
        if (robotSapper instanceof Sapper) {
            if (exhibition3.length == 0) {
                exhibition3 = new Robot[1];
                exhibition3[0] = robotSapper;
            } else {
                Robot[] copyRobot = new Robot[exhibition3.length + 1];
                for (int i = 0; i < copyRobot.length; i++) {
                    if (i != copyRobot.length - 1) {
                        copyRobot[i] = exhibition3[i];
                    } else copyRobot[i] = robotSapper;
                }
                exhibition3 = copyRobot;
            }
        } else {
            System.out.println("В эту выставку могу быть добавленны только роботы сапперы");
        }
    }

    public void activiteRobot() {
        System.out.println("\nВыставка роботов");
        for (Robot r : exhibition1) {
            r.onRobot();
            r.uniquePossibility();
            r.offRobot();
            System.out.println("***********************");
        }
    }

    public void activiteRobotEnginer() {
        System.out.println("\nВыставка инженерных роботов");
        for (Robot r : exhibition2) {
            r.onRobot();
            r.uniquePossibility();
            r.offRobot();
            System.out.println("***********************");
        }
    }

    public void activiteRobotSapper() {
        System.out.println("\nВыставка саперов роботов");
        for (Robot r : exhibition3) {
            r.onRobot();
            r.uniquePossibility();
            r.offRobot();
            System.out.println("***********************");
        }
    }
}
