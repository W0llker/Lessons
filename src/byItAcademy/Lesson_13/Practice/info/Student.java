package byItAcademy.Lesson_13.Practice.info;

public class Student {
    private int id;
    private String name;
    private String surName;
    private String faculty;

    public Student(int id, String name, String surName, String faculty) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
