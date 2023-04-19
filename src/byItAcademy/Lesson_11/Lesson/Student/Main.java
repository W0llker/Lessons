package byItAcademy.Lesson_11.Lesson.Student;

import java.util.ArrayList;
import java.util.List;

/*
1. Создать коллекцию из строк. (5 элементов). Проверить, если элемент в коллекции. Удалить два последних элемента.

2.	Создать класс студент, группа, факультет.

У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
У группы: номер группы, коллекция студентов
У факультета: наименование факультета, список групп.
2.1.Создать несколько студентов.
2.2.Создать несколько групп. По этим группам распределить студентов.
2.3.Создать Факультет. Распределить туда группы.
2.4.Реализовать метод: если у студента средний бал ниже 4-то отчислить его из группы.
2.5.Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
2.6.Добавить поле для факультета энамовского типа: Активный и Неактивный факультет.
2.7.Реализовать метод по смене статуса
2.8.Если общее количество студентов на факультете меньше 20-сделать факультет не актитвным.
2.9.Посчитать средний бал по группе
2.10.Вывести студентов в порядке возрастания среднего бала
2.11.Вывести студентов в порядке убывания среднего бала.
 */
public class Main {
    public static void main(String[] args) {
        Student nikika = new Student("Никита", "Кикита", "27.01.2009", "Гомель", 4.5);
        Student sanya = new Student("Саня", "Усов", "25.03.1995", "Москва", 3.5);
        Student vasya = new Student("Вася", "Пупкин", "17.12.2004", "Рязань", 5);

        Group group1 = new Group("Gp132-1");
        group1.addStudent(nikika);
        group1.addStudent(sanya);
        group1.addStudent(vasya);

        Group group2 = new Group("SP98-01");
        group2.addStudent(nikika);
        group2.addStudent(sanya);
        group2.addStudent(vasya);

        group2.checkingAverageScore(sanya);
        group1.cheackGroupNumber(group2);
        group1.studentAverageScore();

        List<Student> students = group1.sortedStrudentUp();
        System.out.println(students);
        students = group1.sortedStudentDown();
        System.out.println(students);


        Faculty faculty = new Faculty("ФизМат");
        faculty.addGroup(group1);
        faculty.addGroup(group2);
        faculty.cheakCountFaculte();
    }

    public static void collectionString() {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Так");
        list.add("Тик");
        list.add("Тук");
        list.add("Конец");
        System.out.println(list.contains("Тик"));
        System.out.println("**********************");
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
