package byItAcademy.Lesson_11.Lesson.Student;

import java.util.Objects;

public class Student {
    private String name;
    private String surName;
    private String dateOfBirth;
    private String city;
    private double evaluations;

    public Student() {
    }

    public Student(String name, String surName, String dateOfBirth, String city, double evaluations) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.evaluations = evaluations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(double evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", city='" + city + '\'' +
                ", evaluations=" + evaluations +
                "}";
    }
}
