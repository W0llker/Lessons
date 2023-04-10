package byItAcademy.Lesson_9.Practice;

import byItAcademy.Lesson_8.Practice.Car;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Никита","Никиткин",20);
        Person person2 = new Person("Никита","Никиткин",20);
        Person person1 = null;
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }
}
