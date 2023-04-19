package byItAcademy.Lesson_11.Lesson.Hospital;

public class Patient {
    private int id;
    private String name;
    private String surName;
    private String diagnosis;
    private int age;
    private Gender gender;
    static int count;
    public Patient() {
    }

    public Patient(String name, String surName, String diagnosis, int age, Gender gender) {
        this.id = count++;
        this.name = name;
        this.surName = surName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPatient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
