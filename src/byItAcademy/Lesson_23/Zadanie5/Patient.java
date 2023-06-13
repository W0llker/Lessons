package byItAcademy.Lesson_23.Zadanie5;

public class Patient {
    private String name;
    private String surName;
    private int number;
    private String diagnos;

    public Patient(String name, String surName, int number, String diagnos) {
        this.name = name;
        this.surName = surName;
        this.number = number;
        this.diagnos = diagnos;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", number=" + number +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }
}
