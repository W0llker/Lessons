package byItAcademy.Lesson_6.Practice;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int dateOfBirth;
    private String faculty;
    private int course;
    private String group;

    public Student() {

    }

    public Student(int id, String name, String surname, int dateOfBirth, String faculty, int course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
