package byItAcademy.Lesson_6.Lesson;

public class Person {
    String name;
    String surname;
    String secondName;

    public Person() {

    }

    public Person(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void goToTheWork() {
        System.out.println(name + " Пошел на работу");
    }
    public void goToTheWork(boolean isDrink) {
        if (isDrink) {
            System.out.println(name + " не пошел на работу");
        } else System.out.println(name + " Пошел на работу");
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
