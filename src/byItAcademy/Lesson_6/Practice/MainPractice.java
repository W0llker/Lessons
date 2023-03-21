package byItAcademy.Lesson_6.Practice;

/*
Создать классы, спецификации которых приведены ниже. Определить конструкторы Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
 */
public class MainPractice {
    public static void main(String[] args) {
        Student[] mass = new Student[9];
        mass[0] = new Student(0, "Вася", "Василек", 1996, "мат", 2, "DF2");
        mass[1] = new Student(1, "Саша", "Ксер", 1985, "физ", 2, "DF2");
        mass[2] = new Student(2, "Маша", "Черик", 2004, "мат", 2, "DF2");
        mass[3] = new Student(3, "Сеня", "Батон", 1997, "хим", 2, "DZ2");
        mass[4] = new Student(4, "Кирилл", "Кир", 1992, "хим", 1, "DZ2");
        mass[5] = new Student(5, "Стас", "Станислав", 1991, "мат", 2, "DF2");
        mass[6] = new Student(6, "Олег", "Олегович", 1993, "физ", 2, "DF2");
        mass[7] = new Student(7, "Петя", "Петрович", 1998, "хим", 1, "DZ2");
        mass[8] = new Student(8, "Никита", "Кикита", 2001, "мат", 2, "DF2");

        new MainPractice().findStudentFaculty(mass, "мат");
        System.out.println("****************************************************");
        new MainPractice().findStudentGroup(mass, "DF2");
        System.out.println("****************************************************");
        new MainPractice().findStudentDate(mass, 1998);
        System.out.println("****************************************************");
        new MainPractice().findStudentFacultyAndCourse(mass, "хим",1);
        System.out.println("****************************************************");
    }

    public void findStudentFaculty(Student[] mass, String faculty) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getFaculty().equals(faculty)) {
                System.out.println(mass[i]);
            }
        }
    }

    public void findStudentDate(Student[] mass, int Date) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getDateOfBirth() > Date) {
                System.out.println(mass[i]);
            }
        }
    }

    public void findStudentFacultyAndCourse(Student[] mass, String faculty,int course) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getFaculty().equals(faculty) && mass[i].getCourse() == course) {
                System.out.println(mass[i]);
            }
        }
    }

    public void findStudentGroup(Student[] mass, String group) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].getGroup().equals(group)) {
                System.out.println(mass[i]);
            }
        }
    }
}
