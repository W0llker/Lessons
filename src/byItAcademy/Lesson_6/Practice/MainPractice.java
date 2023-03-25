package byItAcademy.Lesson_6.Practice;

import java.util.Arrays;

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
        Student[] students = initialization();
        Student[] studentsFaculty = new MainPractice().findStudentFaculty(students, "КСИС");
        Student[] studentsGroup = new MainPractice().findStudentGroup(students, "DF2");
        Student[] studentsDate = new MainPractice().findStudentDate(students, 1998);
        Student[] studentsFacultyAndCourse = new MainPractice().findStudentFacultyAndCourse(students, "КСИС",1);
        Student[] studentsFacultyChang = new MainPractice().findStudentFaculteChange(students,"телекоммуникаций","КСИС");

        System.out.println("Вывод всех студентов с мат факультета");
        System.out.println(Arrays.toString(studentsFaculty));

        System.out.println("\nВывод студентов из группы КСИС");
        System.out.println(Arrays.toString(studentsGroup));

        System.out.println("\nВывод студентов которые родились после 1998");
        System.out.println(Arrays.toString(studentsDate));

        System.out.println("\nВывод студентов c КСИС факультета и 1 курса");
        System.out.println(Arrays.toString(studentsFacultyAndCourse));

        System.out.println("\nВывод всех студентов после перевода");
        System.out.println(Arrays.toString(studentsFacultyChang));
    }
    public static Student[] initialization() {
        Student[] students = new Student[9];
        students[0] = new Student(0, "Вася", "Василек", 1996, "телекоммуникаций", 2, "DF2");
        students[1] = new Student(1, "Саша", "Ксер", 1985, "телекоммуникаций", 2, "DF2");
        students[2] = new Student(2, "Маша", "Черик", 2004, "КСИС", 2, "DF2");
        students[3] = new Student(3, "Сеня", "Батон", 1997, "КСИС", 2, "DZ2");
        students[4] = new Student(4, "Кирилл", "Кир", 1992, "КСИС", 1, "DZ2");
        students[5] = new Student(5, "Стас", "Станислав", 1991, "телекоммуникаций", 2, "DF2");
        students[6] = new Student(6, "Олег", "Олегович", 1993, "телекоммуникаций", 2, "DF2");
        students[7] = new Student(7, "Петя", "Петрович", 1998, "телекоммуникаций", 1, "DZ2");
        students[8] = new Student(8, "Никита", "Кикита", 2001, "КСИС", 2, "DF2");
        return students;
    }

    public Student[] findStudentFaculty(Student[] mass, String faculty) {
        Student[] students = new Student[mass.length];
        int j = 0;
        for (Student student : mass) {
            if (student.getFaculty().equals(faculty)) {
                students[j] = student;
                j++;
            }
        }
        return students;
    }

    public Student[] findStudentDate(Student[] mass, int Date) {
        Student[] students = new Student[mass.length];
        int j = 0;
        for (Student student : mass) {
            if (student.getDateOfBirth() > Date) {
                students[j] = student;
                j++;
            }
        }
        return students;
    }

    public Student[] findStudentFacultyAndCourse(Student[] mass, String faculty, int course) {
        Student[] students = new Student[mass.length];
        int j = 0;
        for (Student student : mass) {
            if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                students[j] = student;
                j++;
            }
        }
        return students;
    }

    public Student[] findStudentGroup(Student[] mass, String group) {
        Student[] students = new Student[mass.length];
        int j = 0;
        for (Student student : mass) {
            if (student.getGroup().equals(group)) {
                students[j] = student;
                j++;
            }
        }
        return students;
    }
    public Student[] findStudentFaculteChange(Student[] mass, String faculty, String facultyChange) {
        Student[] students = new Student[mass.length];
        int j = 0;
        for (Student student : mass) {
            if (student.getFaculty().equals(faculty)) {
                student.setFaculty(facultyChange);
            }
            students[j] = student;
            j++;
        }
        return students;
    }
}
