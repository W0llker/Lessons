package byItAcademy.Lesson_13.Practice.info;

public class Employee {
    private int id;
    private String name;
    private String surName;

    public Employee(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
